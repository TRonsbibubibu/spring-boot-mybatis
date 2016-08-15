package com.trons.exception;

/**
 * Created by trons on 16-7-10.
 */
public class TokenExpiresException extends BaseException{
    public TokenExpiresException() {
        super.setCode(20008);
    }
}
