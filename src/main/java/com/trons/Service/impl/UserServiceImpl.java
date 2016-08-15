package com.trons.Service.impl;


import com.trons.Service.UserService;
import com.trons.common.PasswordUtils;
import com.trons.entity.User;
import com.trons.exception.BaseException;
import com.trons.exception.PasswordErrorException;
import com.trons.exception.UserNotExistException;
import com.trons.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by trons on 16-8-14.
 * TIME: 下午12:04
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public User login(String stuCode, String password) throws BaseException {
        String resultPassword = PasswordUtils.encryption(password);

        User user = userMapper.getByStuCode(stuCode);
        if(user == null)
            throw new UserNotExistException();
        if(!user.getPassword().equals(resultPassword))
            throw new PasswordErrorException();
        return user;
    }
}
