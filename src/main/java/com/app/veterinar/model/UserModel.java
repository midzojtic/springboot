package com.app.veterinar.model;

import java.math.BigDecimal;

/**
 * This is model for user
 */
public class UserModel {

    private BigDecimal userId;
    private String username;
    private String password;
    private String email;

    @SuppressWarnings("javadoc")
    public BigDecimal getUserId() {
        return userId;
    }

    @SuppressWarnings("javadoc")
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    @SuppressWarnings("javadoc")
    public String getUsername() {
        return username;
    }
    @SuppressWarnings("javadoc")
    public void setUsername(String username) {
        this.username = username;
    }
    @SuppressWarnings("javadoc")
    public String getPassword() {
        return password;
    }

    @SuppressWarnings("javadoc")
    public void setPassword(String password) {
        this.password = password;
    }

    @SuppressWarnings("javadoc")
    public String getEmail() {
        return email;
    }

    @SuppressWarnings("javadoc")
    public void setEmail(String email) {
        this.email = email;
    }
}
