package com.thales.store.DAO;

import com.thales.store.model.User;

public interface UserDAO {

    public void insert(User user);
    public User findById(int userId);

}
