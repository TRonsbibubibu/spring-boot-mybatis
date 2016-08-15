package com.trons.exception;

/**
 * Created by trons on 16-7-10.
 */
public class NeedLoginException extends BaseException{
    public NeedLoginException() {
        super.setCode(20007);
    }
}
