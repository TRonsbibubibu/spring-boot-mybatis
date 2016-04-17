package com.trons.service;

import com.trons.mapper.UserMapper;
import com.trons.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by trons on 16-4-17.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(int id){
        User user = userMapper.findUserInfo(id);
        return user;
    }

    public User[] getAllUser(){
        return userMapper.getAllUser();
    }
}