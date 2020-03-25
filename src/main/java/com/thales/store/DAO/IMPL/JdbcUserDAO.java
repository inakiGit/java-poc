package com.thales.store.DAO.IMPL;

import com.thales.store.DAO.UserDAO;
import com.thales.store.JDBC.Database;
import com.thales.store.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserDAO implements UserDAO {


    private void connectAndExecuteQuery(String query, Database dbConf) {

        try (
                Connection conn = DriverManager.getConnection(dbConf.getHost(), dbConf.getName(), dbConf.getPass());
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.executeQuery();

        } catch (SQLException e) {
            System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void insertOne(User user, Database dbConf) {

        String sqlRequestValues =" (userid, email, login, address) VALUES ('%d', '%s', '%s', '%s')";
        String sqlRequest = "INSERT INTO USERS" +
                String.format(sqlRequestValues, user.getUserId(), user.getEmail(), user.getLogin(), user.getAddress());

        connectAndExecuteQuery(sqlRequest, dbConf);
    }

    public User findOneById(int userIid, Database dbConf) {

        String sqlRequest = String.format("SELECT * FROM USERS WHERE userid=%s", userIid);

        User user = null;

        try (
                Connection conn = DriverManager.getConnection(dbConf.getHost(), dbConf.getName(), dbConf.getPass());
                PreparedStatement ps = conn.prepareStatement(sqlRequest)
        ) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(
                        rs.getInt("userid"),
                        rs.getString("email"),
                        rs.getString("login"),
                        rs.getString("address")
                );
            }

        } catch (SQLException e) {
            System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
            throw new RuntimeException(e);
        }
        return user;
    }

    public List<User> findAll(Database dbConf){

        String sqlRequest = "SELECT * FROM users";

        List<User> userList = new ArrayList<>();

        try (
                Connection conn = DriverManager.getConnection(dbConf.getHost(), dbConf.getName(), dbConf.getPass());
                PreparedStatement ps = conn.prepareStatement(sqlRequest)
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(
                        rs.getInt("userid"),
                        rs.getString("email"),
                        rs.getString("login"),
                        rs.getString("address")
                );
                userList.add(user);
            }

        } catch (SQLException e) {
            System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
            throw new RuntimeException(e);
        }
        return userList;
    }

    public void deleteOneById(int userId, Database dbConf) {
        String sqlRequest = String.format("DELETE FROM users WHERE userid=%s", userId);
        connectAndExecuteQuery(sqlRequest, dbConf);
    }
}
