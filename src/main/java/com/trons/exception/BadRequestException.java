package com.trons.exception;

/**
 * Created by trons on 16-8-13.
 * TIME: 下午10:51
 */
public class BadRequestException extends BaseException {
    public BadRequestException() {
        super.setCode(10000);
    }
}
