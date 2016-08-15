package com.trons.dto.request.impl;

import com.trons.dto.request.BaseRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by trons on 16-8-14.
 * TIME: 上午9:36
 */
public class UserLoginRequest implements BaseRequest {
    @NotBlank
    private String stuCode;
    @NotBlank
    private String password;
    @NotBlank
    private String client;

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "stuCode='" + stuCode + '\'' +
                ", password='" + password + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}
