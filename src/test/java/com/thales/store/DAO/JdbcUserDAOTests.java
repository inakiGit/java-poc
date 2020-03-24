package com.thales.store.DAO;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import com.thales.store.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = JdbcUserDAO.class)
public class JdbcUserDAOTests {

    @Test
    void findByIdTest() {
    }

    @Test
    void findAllTest() {
        JdbcUserDAO accessObj = new JdbcUserDAO();
        List<User> result = accessObj.GetAll();
        result.forEach((y -> System.out.println(y)));
    }
}
