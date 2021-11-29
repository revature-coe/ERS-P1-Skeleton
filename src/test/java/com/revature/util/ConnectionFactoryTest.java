package com.revature.util;

import com.revature.models.Role;
import com.revature.models.User;
import com.revature.repositories.UserDAO;
import com.revature.services.UserService;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ConnectionFactoryTest {

    private static ConnectionFactory connectionFactory;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        connectionFactory = ConnectionFactory.getInstance();
    }

    @Test
    public void testConnectionFactoryIsAbleToGetConnection() {
        Connection conn = connectionFactory.getConnection();

        assertThat(conn, instanceOf(Connection.class));
    }
}
