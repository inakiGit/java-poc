package com.thales.store.JDBC;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Printer {

    public void printResultSet(ResultSet resultSet) throws SQLException {
        ResultSetMetaData md = resultSet.getMetaData();
        int columnsNumber = md.getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i<= columnsNumber; i++){
                if (i > 1) System.out.println(", ");
                String columnValue = resultSet.getString(i);
                System.out.println(columnValue + " " + md.getColumnName(i));
            }
            System.out.println("");
        }
    }
}
