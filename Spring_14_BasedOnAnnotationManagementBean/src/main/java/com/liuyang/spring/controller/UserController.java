package com.liuyang.spring.controller;

import com.liuyang.spring.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save(){
        userService.save();
    }
}
