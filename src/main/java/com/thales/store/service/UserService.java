package com.thales.store.service;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";

    private static final String name = "postgres";

    private static final String pass = "caudillo";

    public String findOneById(int userId){
        return new JdbcUserDAO(host, name, pass).findOneById(userId).toString();
    }

    public String findAll(){
        return new JdbcUserDAO(host, name, pass).findAll().toString();
    }
}
