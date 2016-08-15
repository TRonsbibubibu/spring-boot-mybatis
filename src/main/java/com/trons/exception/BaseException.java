package com.trons.exception;

/**
 * Created by trons on 16-8-13.
 * TIME: 下午10:44
 */
public abstract class BaseException extends Exception{
    private int code;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
