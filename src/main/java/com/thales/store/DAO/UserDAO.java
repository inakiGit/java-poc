package com.thales.store.DAO;

import com.thales.store.model.User;

import java.util.List;

public interface UserDAO {

    public void insertOne(User user);

    public User findOneById(int userId);

    public List<User> findAll();

}
