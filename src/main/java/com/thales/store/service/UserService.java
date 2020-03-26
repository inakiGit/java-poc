package com.thales.store.service;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    JdbcUserDAO userRepository;

    public String findOne(){
        return userRepository.findOneById(1).toString();
    }
}
