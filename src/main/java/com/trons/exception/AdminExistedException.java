package com.trons.exception;

/**
 * Created by trons on 16-8-13.
 * TIME: 下午10:51
 */
public class AdminExistedException extends BaseException {
    public AdminExistedException() {
        super.setCode(20006);
    }
}
