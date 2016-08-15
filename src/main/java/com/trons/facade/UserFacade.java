package com.trons.facade;


import com.trons.Service.TokenService;
import com.trons.Service.UserService;
import com.trons.dto.response.impl.UserLoginResponse;
import com.trons.entity.Token;
import com.trons.entity.User;
import com.trons.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by trons on 16-8-14.
 * TIME: 上午9:58
 */
@Service
public class UserFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    public UserLoginResponse userLogin(String stuCode, String password, String client) throws BaseException {
        /**
         * 用户登陆
         */
        User user = userService.login(stuCode, password);
        /**
         * 更新token
         */
        Token token = tokenService.upsert(user.getId(), false, client);
        return new UserLoginResponse(user, token);
    }
}
