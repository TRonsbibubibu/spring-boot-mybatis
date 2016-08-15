package com.trons.Service;


import com.trons.entity.User;
import com.trons.exception.BaseException;

/**
 * Created by trons on 16-8-14.
 * TIME: 上午11:53
 */
public interface UserService {
    User get(long id);

    User login(String stuCode, String password) throws BaseException;
}
