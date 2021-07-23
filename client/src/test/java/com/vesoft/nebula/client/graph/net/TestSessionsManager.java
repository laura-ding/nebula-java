/* Copyright (c) 2020 vesoft inc. All rights reserved.
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
import com.vesoft.nebula.client.graph.exception.InvalidConfigException;
import com.vesoft.nebula.client.graph.exception.InvalidSessionException;
import com.vesoft.nebula.client.graph.exception.NotValidConnectionException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestSessionsManager {
    @Test()
    public void testBase() {
        try {
            try {
                NebulaPool pool = new NebulaPool();
                NebulaPoolConfig nebulaPoolConfig = new NebulaPoolConfig();
                nebulaPoolConfig.setMaxConnSize(1);
                Assert.assertTrue(pool.init(Arrays.asList(new HostAddress("127.0.0.1", 9670)),
                    nebulaPoolConfig));
                Session session = pool.getSession("root", "nebula", true);
                ResultSet resp = session.execute("CREATE SPACE IF NOT EXISTS test_session_manager(vid_type=INT);");
                Assert.assertTrue(resp.getErrorMessage(), resp.isSucceeded());
                session.release();
                pool.close();
            } catch (UnknownHostException | NotValidConnectionException | AuthFailedException e) {
                e.printStackTrace();
                assert false;
            }

            SessionsManagerConfig config = new SessionsManagerConfig();
            config.setAddresses(Collections.singletonList(
                new HostAddress("127.0.0.1", 9670)))
                .setUserName("root")
                .setPassword("nebula")
                .setSpaceName("test_session_manager");
            SessionsManager sessionsManager = new SessionsManager(config);
            // Gets the session of the specified space
            Session session = sessionsManager.getSession();
            ResultSet resultSet = session.execute("SHOW TAGS");
            Assert.assertEquals("test_session_manager", resultSet.getSpaceName());

            // Test return session
            try {
                sessionsManager.returnSession(session);
                session.execute("SHOW TAGS");
                Assert.assertTrue(false);
            } catch (InvalidSessionException e) {
                Assert.assertTrue(true);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                assert false;
            }

            // Test close
            try {
                session = sessionsManager.getSession();
                sessionsManager.close();
                session.execute("SHOW SPACES");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                assert true;
            } catch (Exception e) {
                assert false;
            }

        } catch (InvalidConfigException | IOErrorException e) {
            Assert.assertTrue(false);
        }
    }
}
