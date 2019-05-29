package com.app.veterinar.controller;

import com.app.veterinar.model.RestDto;
import com.app.veterinar.model.UserModel;
import com.app.veterinar.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Controller is used for login to Veterinar application
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
@Validated
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    private final LoginService service;

    @Autowired
    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public @ResponseBody
    RestDto<UserModel> login(@RequestBody @Valid UserModel user) {

        LOG.info("Accessed login");

        LOG.debug("User => username: {}, password: {}", user.getUsername(), user.getPassword());

        //TODO dodati enkripciju i validaciju preko tokena
        boolean result = service.validateUser(user);

        if (!result) {
            LOG.info("Wrong username or password");
            return RestDto.fail("Wrong username or password");
        } else {
            LOG.info("Successfull login");
            LOG.trace("User: {}", user.toString());
            return RestDto.success(user, "Login was successful");
        }
    }
}
