package com.trons.entity;

import org.springframework.http.HttpStatus;

/**
 * Created by trons on 16-4-21.
 */
public class Response {
    HttpStatus status = HttpStatus.ACCEPTED;
    int code;
    Object data;
    String message;

    public Response() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
