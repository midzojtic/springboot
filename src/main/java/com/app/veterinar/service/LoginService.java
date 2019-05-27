package com.app.veterinar.service;

import com.app.veterinar.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
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
