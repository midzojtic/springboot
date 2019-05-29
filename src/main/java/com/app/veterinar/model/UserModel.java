package com.app.veterinar.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

/**
 * This is model for user
 */
@Component
public class UserModel {

    @NotEmpty(message = "Username must be filled")
    private String username;

    @NotEmpty(message = "Password must be filled")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
