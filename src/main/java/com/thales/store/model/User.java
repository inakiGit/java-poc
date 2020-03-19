package com.thales.store.model;

import java.util.ArrayList;
import java.util.Objects;

public class User {

    private int userId;

    private String email;

    private String login;

    private String address;

    private ArrayList<String> roles;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", address='" + address + '\'' +
                ", roles=" + roles +
                '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getEmail(), getLogin(), getAddress(), getRoles());
    }
}
