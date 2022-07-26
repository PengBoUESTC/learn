package com.example.userconsumer.controller;

import com.example.userconsumer.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("/user")
    public String getUserInof() {
        return userInfoService.getUserInfo("test");
    }
}
