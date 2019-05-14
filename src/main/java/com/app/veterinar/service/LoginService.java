package com.app.veterinar.service;

import com.app.veterinar.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(UserModel user) {

        if (user == null)
            return false;

        String username = user.getUsername();
        String password = user.getPassword();

        if (username == null || username.isEmpty())
            return false;

        if (password == null || password.isEmpty())
            return false;

        return true;
    }
}
