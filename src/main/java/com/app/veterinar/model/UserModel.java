package com.app.veterinar.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

/**
 * This is model for user
 */
@Entity
@Data
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue
    private Long userId;

    @NotEmpty(message = "Username must be filled")
    private String username;

    @NotEmpty(message = "Password must be filled")
    private String password;



}
