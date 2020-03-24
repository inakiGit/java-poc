package com.thales.store.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int userId;

    private String email;

    private String login;

    private String address;

    public User(int userId, String email, String login, String address) {
        this.userId = userId;
        this.email = email;
        this.login = login;
        this.address = address;
    }
}