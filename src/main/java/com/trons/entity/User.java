package com.trons.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by trons on 16-4-17.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private String name;
    private Integer age;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
