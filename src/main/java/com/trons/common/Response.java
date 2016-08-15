package com.trons.common;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by trons on 16-7-10.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response{
    private int code;
    private Object data;

    public Response(int code) {
        this.code = code;
    }

    public Response(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
