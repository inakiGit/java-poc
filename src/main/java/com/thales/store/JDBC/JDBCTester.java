/*
Utility method for manual tests
*/

package com.thales.store.JDBC;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import com.thales.store.model.User;

import java.util.List;

public class JDBCTester {

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";

    private static final String name = "postgres";

    private static final String pass = "caudillo";

    public static void main(String[] args) {
        JdbcUserDAO x = new JdbcUserDAO(host, name, pass);
        User user = new User(4, "email4", "login4", "addres4");
        //x.insertOne(user);
        //x.deleteOneById(4);
        List<User> result = x.findAll();
        result.forEach(y -> System.out.println(y.getAddress()));
    }
}
