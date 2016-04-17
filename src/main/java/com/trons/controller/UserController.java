package com.trons.controller;

import com.trons.model.User;
import com.trons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by trons on 16-4-17.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/userinfo")
    public User getUserInfo(@RequestParam(name = "id")int id){
        User user = userService.getUserInfo(id);
        return user;
    }

    @ResponseBody
    @RequestMapping("/alluser")
    public User[] getAllUser(){
        return userService.getAllUser();
    }
}
