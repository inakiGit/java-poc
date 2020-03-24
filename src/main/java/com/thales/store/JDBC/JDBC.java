/*
java.sql contains all JDBC classes / interfaces needed for database programming
java.sql only defines behaviour, the actual implementation is done by a third party DRIVER
The DRIVER implements the interfaces defined in the java.sql package
*/

package com.thales.store.JDBC;

import java.sql.*;

public class JDBC {

    private static final String SELECT_QUERY = "SELECT * FROM users";

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";
    private static final String uName = "postgres";
    private static final String uPass = "caudillo";

    public static void main(String[] args) {

        try {
            // We need a connection object that represents a physical connection
            Connection conn = DriverManager.getConnection(host, uName, uPass);
            if (conn != null) System.out.println("Connected");
            // We need an object of type Statement for building and submitting an SQL statement
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_QUERY);
            new Printer(rs);

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
