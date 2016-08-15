package com.trons.exception;

/**
 * Created by trons on 16-7-10.
 */
public class IllegalActivityException extends BaseException{
    public IllegalActivityException() {
        super.setCode(30002);
    }
}
