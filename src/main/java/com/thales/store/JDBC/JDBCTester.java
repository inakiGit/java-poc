/*
Utility method for manual tests
*/

package com.thales.store.JDBC;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import com.thales.store.model.User;

import java.sql.SQLException;

public class JDBCTester {

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";

    private static final String name = "postgres";

    private static final String pass = "caudillo";

    public static void main(String[] args) throws SQLException {
        Database dbConfiguration = new Database(host, name, pass);
        JdbcUserDAO x = new JdbcUserDAO();
        User user = new User(4, "email4", "login4", "addres4");
        x.insertOne(user);
        x.deleteOneById(4);
    }
}
