package com.thales.store.DAO;

import com.thales.store.model.User;

import java.util.List;

public interface UserDAO {

    public void insert(User user);

    public User GetById(int userId);

    public List<User> GetAll();

}
