/*
Utility method for manual tests
*/

package com.thales.store.JDBC;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import com.thales.store.model.User;

import java.util.ArrayList;
import java.util.List;

public class JDBCTester {

    public static void main(String[] args) {
        List<User> u = new ArrayList<User>();
        JdbcUserDAO x = new JdbcUserDAO();
        User user = x.GetById(1);
        u.add(user);
        u.forEach((y -> System.out.println(y)));
    }
}
