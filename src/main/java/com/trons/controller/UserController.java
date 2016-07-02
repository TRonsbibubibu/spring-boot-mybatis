package com.trons.controller;

import com.trons.Error.TestError;
import com.trons.entity.User;
import com.trons.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ResponseBody
    @RequestMapping("/userinfo")
    public User getUserInfo(@RequestParam(name = "id")int id) throws TestError {
        User user = userService.getUserInfo(id);
        return user;
    }

    @ResponseBody
    @RequestMapping("/alluser")
    public String getAllUser() throws TestError {
//        return userService.getAllUser();
        logger.warn("我好似电话粉丝电话");
        throw new TestError("dddddd");
    }
}
