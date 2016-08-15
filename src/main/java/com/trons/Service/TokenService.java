package com.trons.Service;

import com.trons.entity.Token;
import com.trons.exception.BaseException;

/**
 * Created by trons on 16-8-14.
 * TIME: 下午1:22
 */
public interface TokenService {
    Token upsert(long userId, boolean isAdmin, String client);

    Token verify(String token) throws BaseException;
}
