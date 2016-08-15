package com.trons.entity;


import com.trons.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by trons on 16-8-13.
 * TIME: 下午11:24
 */
public class User {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户id
     */
    private long id;
    /**
     * 学号
     */
    private String stuCode;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * 学院
     */
    private String college;
    /**
     * 专业
     */
    private String major;
    /**
     * 性别
     */
    private String sex;
    /**
     * 是否冻结
     */
    private boolean freeze;
    /**
     * 学生信息uuid
     */
    private String stuInfoId;
    /**
     * 创建时间
     */
    private long createAt;
    /**
     * 更新时间
     */
    private long updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean getFreeze() {
        return freeze;
    }

    public void setFreeze(boolean freeze) {
        this.freeze = freeze;
    }

    public String getStuInfoId() {
        return stuInfoId;
    }

    public void setStuInfoId(String stuInfoId) {
        this.stuInfoId = stuInfoId;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }
}
