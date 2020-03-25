package com.thales.store.DAO;

import com.thales.store.JDBC.Database;
import com.thales.store.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    public void insertOne(User user, Database dbConf);

    public User findOneById(int userId, Database dbConf) throws SQLException;

    public List<User> findAll(Database dbConf);

}
