/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph.net;

import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.data.ResultSet;
import com.vesoft.nebula.client.graph.data.ValueWrapper;
import com.vesoft.nebula.client.graph.exception.AuthFailedException;
import com.vesoft.nebula.client.graph.exception.IOErrorException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestConnection {
    @Test
    public void testAll() {
        Connection connection = new Connection();
        try {
            // test open
            connection.open(new HostAddress("127.0.0.1", 3699), 1000);
            // test auth
            long sessionId = connection.authenticate("root", "nebula");
            assert sessionId != 0;
            connection.async_execute(sessionId, "SHOW HOSTS",
                (RpcResponse<ResultSet> rpcResponse) -> {
                    ResultSet resultSet = rpcResponse.getResult();
                    List<String> colNames = resultSet.keys();
                    for (String name : colNames) {
                        System.out.printf("%15s |", name);
                    }
                    System.out.println();
                    for (int i = 0; i < resultSet.rowsSize(); i++) {
                        ResultSet.Record record = resultSet.rowValues(i);
                        for (ValueWrapper value : record) {
                            if (value.isLong()) {
                                System.out.printf("%15s |", value.asLong());
                            }
                            if (value.isString()) {
                                try {
                                    System.out.printf("%15s |", value.asString());
                                } catch (UnsupportedEncodingException e) {
                                    e.printStackTrace();
                                    assert false;
                                }
                            }
                        }
                        System.out.println();
                    }
                });

            TimeUnit.SECONDS.sleep(2);

            // test with future
            RpcResponse<ResultSet> executeResult = connection.async_execute(sessionId,
                "SHOW HOSTS").get();
            assert !executeResult.hasError();
            ResultSet resultSet = executeResult.getResult();
            assert resultSet.isSucceeded();
            assert resultSet.keys().size() == 6;
            assert resultSet.keys().get(0).equals("Host");
            assert resultSet.keys().get(1).equals("Port");
            assert resultSet.keys().get(2).equals("Status");
            assert resultSet.keys().get(3).equals("Leader count");
            assert resultSet.keys().get(4).equals("Leader distribution");
            assert resultSet.keys().get(5).equals("Partition distribution");

            assert resultSet.rowValues(0).get(0).isString();
            assert resultSet.rowValues(1).get(0).isString();
            assert resultSet.rowValues(2).get(0).isString();
            assert resultSet.rowValues(0).get(0).asString().equals("storaged0");
            assert resultSet.rowValues(1).get(0).asString().equals("storaged1");
            assert resultSet.rowValues(2).get(0).asString().equals("storaged2");

            assert resultSet.rowValues(0).get(1).isLong();
            assert resultSet.rowValues(1).get(1).isLong();
            assert resultSet.rowValues(2).get(1).isLong();
            assert resultSet.rowValues(0).get(1).asLong() == 44500;
            assert resultSet.rowValues(1).get(1).asLong() == 44500;
            assert resultSet.rowValues(2).get(1).asLong() == 44500;

            // test use future wait
            NFuture<RpcResponse<ResultSet>> futResp = connection.async_execute(
                sessionId, "SHOW HOSTS");
            while (!futResp.isDone()) {
                TimeUnit.MILLISECONDS.sleep(10);
            }
            assert !futResp.getResult().hasError();
            ResultSet data = futResp.getResult().getResult();

            assert data.rowValues(0).get(0).asString().equals("storaged0");
            assert data.rowValues(1).get(0).asString().equals("storaged1");
            assert data.rowValues(2).get(0).asString().equals("storaged2");

            assert resultSet.rowValues(0).get(1).asLong() == 44500;
            assert resultSet.rowValues(1).get(1).asLong() == 44500;
            assert resultSet.rowValues(2).get(1).asLong() == 44500;

            // test multi callback
            connection.async_execute(sessionId, "SHOW HOSTS",
                (RpcResponse<ResultSet> rpcResponse) -> {
                    System.out.println("====== callback ========");
                });

            // test timeout
            try {
                RpcResponse<ResultSet> resp = connection.async_execute(
                    sessionId, "SHOW HOSTS").get(1, TimeUnit.NANOSECONDS);
                assert false;
            } catch (TimeoutException e) {
                assert true;
            } catch (Exception e) {
                e.printStackTrace();
                assert false;
            }
            TimeUnit.MILLISECONDS.sleep(2);
            connection.signout(sessionId);
        } catch (Exception e) {
            e.printStackTrace();
            assert false;
        } finally {
            connection.close();
        }
    }
}
