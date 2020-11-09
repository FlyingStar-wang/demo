package com.wx.demo.controller;

import com.wx.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 用户接口
 * @author: Mr.Wang
 * @create: 2020-11-08 23:58
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "getUser")
    public String getUser() {
        return "";
    }
}
