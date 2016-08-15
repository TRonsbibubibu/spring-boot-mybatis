package com.trons.exception;

/**
 * Created by trons on 16-7-10.
 */
public class PasswordErrorException extends BaseException{
    public PasswordErrorException() {
        super.setCode(20002);
    }
}
