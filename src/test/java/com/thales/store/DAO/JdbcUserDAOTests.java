package com.thales.store.DAO;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest(classes = JdbcUserDAO.class)
public class JdbcUserDAOTests {

    @Test
    void findByIdTest() {
        boolean x = true;
        Assert.isTrue(true, "hello");
    }
}
