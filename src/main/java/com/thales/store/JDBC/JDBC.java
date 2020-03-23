package com.thales.store.JDBC;

import java.sql.*;

public class JDBC {

    private static final String SELECT_QUERY = "SELECT * FROM users";

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";
    private static final String uName = "postgres";
    private static final String uPass = "caudillo";

    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection(host, uName, uPass);
            if (conn != null) System.out.println("Connected");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_QUERY);
            new Printer(rs);

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
