package com.trons.mapper;

import com.trons.model.User;

/**
 * Created by trons on 16-4-17.
 */
public interface UserMapper{
    public User findUserInfo(int id);

    public User[] getAllUser();
}