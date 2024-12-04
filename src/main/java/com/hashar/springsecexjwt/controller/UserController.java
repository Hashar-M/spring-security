package com.hashar.springsecexjwt.controller;

import com.hashar.springsecexjwt.model.Users;
import com.hashar.springsecexjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.register(user);
    }

   @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return userService.verify(user);
    }
}
