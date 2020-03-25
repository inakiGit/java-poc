package com.thales.store.DAO;

import com.thales.store.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    public void insertOne(User user);

    public User findOneById(int userId) throws SQLException;

    public List<User> findAll();

    public void deleteOneById(int id);

}
