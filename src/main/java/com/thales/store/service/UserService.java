package com.thales.store.service;

import com.thales.store.DAO.IMPL.JdbcUserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final String host = "jdbc:postgresql://localhost:5432/postgres";

    private static final String name = "postgres";

    private static final String pass = "caudillo";

    public String findOne(){
        return new JdbcUserDAO(host, name, pass).findOneById(1).toString();
    }
}
