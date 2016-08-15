package com.trons.exception;

/**
 * Created by trons on 16-8-13.
 * TIME: 下午10:51
 */
public class UserNotExistException extends BaseException {
    public UserNotExistException() {
        super.setCode(20001);
    }
}
