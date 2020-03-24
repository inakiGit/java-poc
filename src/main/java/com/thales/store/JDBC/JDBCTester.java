/*
Utility method for manual tests
*/

package com.thales.store.JDBC;

import com.thales.store.DAO.IMPL.JdbcUserDAO;

public class JDBCTester {

    public static void main(String[] args) {
        JdbcUserDAO x = new JdbcUserDAO();
        x.GetAll();
    }
}
