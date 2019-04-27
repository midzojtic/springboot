package com.app.veterinar.controller;

import com.app.veterinar.model.RestDto;
import com.app.veterinar.model.UserModel;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;

/**
 * Controller is used for login to Veterinar application
 */
@RestController
@RequestMapping("/")
@CrossOrigin
@Validated
public class LoginController {

    @PostMapping
    public @ResponseBody
    RestDto<UserModel> login(@NotEmpty String username, @NotEmpty String password) {

        RestDto<UserModel> restDto = new RestDto<>();
            String str = "";
        return restDto;
    }
}
