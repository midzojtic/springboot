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

    @PostMapping(value = "/")
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody
    RestDto<UserModel> login(@RequestBody @Valid RestDto<UserModel> user) {

        LOG.info("Accessed login");

        //TODO dodati enkripciju i validaciju preko tokena
        boolean result = service.validateUser(user.getData());

        if (!result) {
            LOG.info("Wrong username or password");
            return RestDto.fail("Wrong username or password");
        } else {
            LOG.info("Successfull login");
            LOG.trace("User: {}", user.getData().toString());
            return RestDto.success(user.getData(), "Login was successful");
        }
    }
}
