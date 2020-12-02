/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph.net;

import com.vesoft.nebula.client.graph.data.ResultSet;
import com.vesoft.nebula.client.graph.exception.IOErrorException;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Session {
    private final long sessionID;
    private Connection connection;
    private final GenericObjectPool<Connection> pool;
    private final Boolean retryConnect;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public Session(Connection connection,
                   long sessionID,
                   GenericObjectPool<Connection> connPool,
                   Boolean retryConnect) {
        this.connection = connection;
        this.sessionID = sessionID;
        this.pool = connPool;
        this.retryConnect = retryConnect;
    }

    /**
     * Execute the query sentence.
     *
     * @param stmt The query sentence.
     * @return The ResultSet.
     */
    public ResultSet execute(String stmt)
        throws IOErrorException, ExecutionException, InterruptedException {
        if (connection == null) {
            throw new IOErrorException(IOErrorException.E_CONNECT_BROKEN,
                    "Connection is null");
        }
        RpcResponse<ResultSet> resp = connection.async_execute(sessionID, stmt).get();
        if (!resp.hasError()) {
            return resp.getResult();
        }

        IOErrorException e = resp.getException();
        System.out.println("Exception is " + Exception.class);
        if (e.getType() == IOErrorException.E_CONNECT_BROKEN)  {
            if (pool.getFactory() instanceof ConnObjectPool) {
                ((ConnObjectPool) pool.getFactory()).updateServerStatus();
            }

            if (retryConnect) {
                if (!retryConnect()) {
                    throw new IOErrorException(IOErrorException.E_ALL_BROKEN,
                        "All servers are broken.");
                }
                resp = connection.async_execute(sessionID, stmt).get();
                if (!resp.hasError()) {
                    return resp.getResult();
                }
            }
        }
        throw e;
    }

    public void async_execute(String stmt, Consumer<RpcResponse<ResultSet>> callback) {
        connection.async_execute(sessionID, stmt, (RpcResponse<ResultSet> resp) -> {
            if (!resp.hasError()) {
                callback.accept(resp);
                return;
            }
            IOErrorException e = resp.getException();
            if (((IOErrorException)e).getType() == IOErrorException.E_CONNECT_BROKEN)  {
                if (pool.getFactory() instanceof ConnObjectPool) {
                    ((ConnObjectPool) pool.getFactory()).updateServerStatus();
                }

                if (retryConnect) {
                    if (!retryConnect()) {
                        callback.accept(new RpcResponse(
                            new IOErrorException(IOErrorException.E_ALL_BROKEN,
                            "All servers are broken.")));
                        return;
                    }
                    connection.async_execute(sessionID, stmt, callback);
                }
            }
        });
    }

    // TODO: support do reconnect in future.
    public NFuture<RpcResponse<ResultSet>> async_execute(String stmt) {
        return connection.async_execute(sessionID, stmt);
    }

    private boolean retryConnect() {
        try {
            try {
                pool.invalidateObject(connection);
            } catch (Exception e) {
                log.error("Return object failed");
            }
            Connection newConn = pool.borrowObject();
            if (newConn == null) {
                log.error("Get connection object failed.");
            }
            connection = newConn;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ping() {
        if (connection == null) {
            return false;
        }
        return connection.ping();
    }

    public void release() {
        if (connection == null) {
            return;
        }
        connection.signout(sessionID);
        try {
            pool.returnObject(connection);
        } catch (Exception e) {
            log.warn("Return object to pool failed.");
        }
    }
}
