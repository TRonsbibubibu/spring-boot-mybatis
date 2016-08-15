package com.trons.exception;

/**
 * Created by trons on 16-7-10.
 */
public class UnknowException extends BaseException{
    public UnknowException() {
        super.setCode(10001);
    }
}
