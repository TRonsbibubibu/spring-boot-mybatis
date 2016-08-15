package com.trons.exception;

/**
 * Created by trons on 16-8-13.
 * TIME: 下午10:51
 */
public class AdminNotExistException extends BaseException {
    public AdminNotExistException() {
        super.setCode(20001);
    }
}
