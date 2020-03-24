package com.thales.store.DAO.IMPL;

import com.thales.store.DAO.UserDAO;
import com.thales.store.model.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserDAO implements UserDAO {

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";
    private static final String uName = "postgres";
    private static final String uPass = "caudillo";

    private DataSource dataSource;

    public void SetDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(User user) {
        String sqlRequest = "INSERT INTO USERS" +
                "(userID, email, login, address) VALUES (1, a, b, c)";

        //String sqlRequest = "SELECT * FROM USERS";

        Connection conn;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sqlRequest);
            ps.setInt(1, user.getUserId());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getLogin());
            ps.setString(4, user.getAddress());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findById(int id) {

        String sqlRequest = String.format("SELECT * FROM USERS WHERE userid=%s", id);

        User user = null;

        try (
                Connection conn = DriverManager.getConnection(host, uName, uPass);
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
        }
        return user;
    }

    public List<User> findAll(){

        String sqlRequest = "SELECT * FROM users";

        List<User> userList = new ArrayList<>();

        try (
                Connection conn = DriverManager.getConnection(host, uName, uPass);
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
        }
        return userList;
    }
}
