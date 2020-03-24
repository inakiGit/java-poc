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
        JdbcUserDAO x = new JdbcUserDAO();
        List u = x.GetAll();
        u.forEach((y -> System.out.println(y)));
    }
}
