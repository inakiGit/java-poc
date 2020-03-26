package com.thales.store.service;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${host}")
    private String host;

    @Value("${name}")
    private String name;

    @Value("${pass}")
    private String pass;

    public String findOneById(int userId){
        return new JdbcUserDAO(this.host, this.name, this.pass).findOneById(userId).toString();
    }

    public String findAll(){
        return new JdbcUserDAO(this.host, this.name, this.pass).findAll().toString();
    }
}
