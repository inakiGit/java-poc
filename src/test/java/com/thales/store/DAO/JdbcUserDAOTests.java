package com.thales.store.DAO;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JdbcUserDAO.class)
public class JdbcUserDAOTests {

    @Test
    void findByIdTest() {
    }

    @Test
    void findAllTest() {

        JdbcUserDAO accessObj = new JdbcUserDAO();
        //List<User> result = accessObj.GetAll();
        //result.forEach((y -> System.out.println(y)));
    }
}
