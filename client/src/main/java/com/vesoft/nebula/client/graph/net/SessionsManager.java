/* Copyright (c) 2021 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph.net;

import com.vesoft.nebula.client.graph.NebulaPoolConfig;
import com.vesoft.nebula.client.graph.SessionsManagerConfig;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.data.ResultSet;
import com.vesoft.nebula.client.graph.exception.AuthFailedException;
import com.vesoft.nebula.client.graph.exception.IOErrorException;
import com.vesoft.nebula.client.graph.exception.NotValidConnectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SessionsManager {
    private SessionsManagerConfig config;
    private NebulaPool pool = null;
    private final CopyOnWriteArrayList<Session> sessionList;
    private AtomicInteger sessionsNum = new AtomicInteger(0);
    private Boolean isClose = false;
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public SessionsManager(SessionsManagerConfig config) {
        this.config = config;
        this.sessionList = new CopyOnWriteArrayList<>();
        checkConfig();
    }

    private void checkConfig() {
        if (config.getAddresses().isEmpty()) {
            throw new RuntimeException("Empty graph addresses");
        }

        if (config.getSpaceName().isEmpty()) {
            throw new RuntimeException("Empty space name");
        }
    }

    public synchronized Session getSession() throws RuntimeException {
        checkClose();
        if (pool == null) {
            init();
        }
        // create new session
        if (sessionList.isEmpty()) {
            if (sessionsNum.get() >= config.getPoolConfig().getMaxConnSize()) {
                throw new RuntimeException("The driverManager does not have additional sessions.");
            }
            try {
                Session session = pool.getSession(
                    config.getUserName(), config.getPassword(), config.getReconnect());
                ResultSet resultSet = session.execute("USE " + config.getSpaceName());
                if (!resultSet.isSucceeded()) {
                    throw new RuntimeException(
                        "Switch space `"
                            + config.getSpaceName()
                            + "' failed: "
                            + resultSet.getErrorMessage());
                }
                sessionList.add(session);
                sessionsNum.incrementAndGet();
                return session;
            } catch (AuthFailedException | NotValidConnectionException | IOErrorException e) {
                throw new RuntimeException("Get session failed: " + e.getMessage());
            }
        }
        // use the existed session
        return sessionList.get(sessionList.size() - 1);
    }

    public synchronized void returnSession(Session session) {
        checkClose();
        if (session == null) {
            return;
        }
        if (sessionList.contains(session)) {
            sessionList.remove(session);
        }
    }

    public synchronized void close() {
        if (sessionList.size() < sessionsNum.get()) {
            log.error("Not all sessions managed by the driver have been returned and cannot be closed, "
                + "need to return all session.");
        }
        for (Session session : sessionList) {
            session.release();
        }
        pool.close();
        sessionList.clear();
        isClose = true;
    }

    private void init() throws RuntimeException {
        pool = new NebulaPool();
        try {
            if (!pool.init(config.getAddresses(), config.getPoolConfig())) {
                throw new RuntimeException("Init pool failed");
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException("Init the pool failed: " + e.getMessage());
        }
    }

    private void checkClose() {
        if (isClose) {
            throw new RuntimeException("The SessionDriver was closed.");
        }
    }
}
