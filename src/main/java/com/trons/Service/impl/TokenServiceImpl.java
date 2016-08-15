package com.trons.Service.impl;

import com.trons.Service.TokenService;
import com.trons.Service.UserService;
import com.trons.common.Utils;
import com.trons.entity.Token;
import com.trons.exception.BaseException;
import com.trons.exception.NeedLoginException;
import com.trons.exception.TokenExpiresException;
import com.trons.mapper.TokenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by trons on 16-7-11.
 */
@Service("TokenService")
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenMapper tokenMapper;

    @Autowired
    private UserService userService;

    @Override
    public Token upsert(long userId, boolean isAdmin, String client) {

        Token tokenObj = tokenMapper.getTokenByUserId(userId, isAdmin, client);
        if (tokenObj == null) {
            long time = Utils.createTimeStamp();
            tokenObj = new Token(
                    userId, isAdmin, Utils.createUUID(), client, time, time, 3600000
            );
            tokenMapper.addToken(tokenObj);
        } else {
            String token = Utils.createUUID();
            tokenMapper.updateToken(userId, isAdmin, client, token, Utils.createTimeStamp());
            tokenObj.setToken(token);
        }
        return tokenObj;
    }

    @Override
    public Token verify(String token) throws BaseException {
        Token tokenObj = tokenMapper.getTokenByToken(token);
        if (tokenObj == null)
            throw new NeedLoginException();
        if (tokenObj.getUpdateAt() + tokenObj.getExpiresAt() <= Utils.createTimeStamp())
            throw new TokenExpiresException();

        return tokenObj;
    }
}
