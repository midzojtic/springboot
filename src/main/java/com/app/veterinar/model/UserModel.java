package com.app.veterinar.model;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * This is model for user
 */
public class UserModel {

    private BigDecimal userId;

    @NotEmpty(message = "Username must be filled")
    private String username;

    @NotEmpty(message = "Password must be filled")
    private String password;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

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

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
