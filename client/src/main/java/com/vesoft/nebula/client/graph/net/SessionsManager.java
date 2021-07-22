/* Copyright (c) 2021 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */
package com.vesoft.nebula.client.graph.net;

import com.vesoft.nebula.client.graph.NebulaPoolConfig;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.exception.AuthFailedException;
import com.vesoft.nebula.client.graph.exception.IOErrorException;
import com.vesoft.nebula.client.graph.exception.InvalidConfigException;
import com.vesoft.nebula.client.graph.exception.NotValidConnectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SessionsManager {
    private final List<HostAddress> graphdAddrs;
    private final String spaceName;
    private final String userName;
    private final String password;
    private final NebulaPoolConfig config;
    private final boolean isReconnect;
    private final NebulaPool pool;
    private final Map<Session, Boolean> sessionMap;
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public SessionsManager(List<HostAddress> graphdAddrs,
                           String spaceName,
                           String userName,
                           String password,
                           NebulaPoolConfig config,
                           boolean isReconnect) {
        this.graphdAddrs = graphdAddrs;
        this.spaceName = spaceName;
        this.userName = userName;
        this.password = password;
        this.config = config;
        this.isReconnect = isReconnect;
        this.pool = new NebulaPool();
        this.sessionMap = new ConcurrentHashMap<>();
    }

    public void init() throws RuntimeException {
        try {
            if (!pool.init(graphdAddrs, config)) {
                throw new RuntimeException("Init pool failed");
            }
            for (int i = 0; i < config.getMaxConnSize(); i++) {
                Session session = pool.getSession(userName, password, isReconnect);
                sessionMap.put(session, false);
            }
        } catch (UnknownHostException |
            AuthFailedException |
            NotValidConnectionException |
            IOErrorException e) {
            throw new RuntimeException("Init the pool failed: " + e.getMessage());
        }
    }

    public Session getSession() {

    }

    public void returnSession(Session session) {
        if (sessionMap.containsKey(session)) {
            sessionMap.remove(session);
            return;
        }

    }
}
