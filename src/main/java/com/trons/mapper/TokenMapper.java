package com.trons.mapper;

import com.trons.entity.Token;
import org.apache.ibatis.annotations.Param;

/**
 * Created by trons on 16-7-10.
 */
public interface TokenMapper {
    public Token getTokenByUserId(@Param("id") long id, @Param("isAdmin") boolean isAdmin, @Param("client") String client);

    public Token getTokenByToken(String token);

    public Integer updateToken(
            @Param("id") long id, @Param("isAdmin") boolean isAdmin,
            @Param("client") String client, @Param("token") String token, @Param("updateAt") long updateAt
    );

    public Integer addToken(Token token);

    public Integer deleteToken(@Param("id") long id, @Param("isAdmin") boolean isAdmin);
}
