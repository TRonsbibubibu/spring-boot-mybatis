package com.trons.dto.response.impl;


import com.trons.dto.response.BaseResponse;

/**
 * Created by trons on 16-8-14.
 * TIME: 上午10:00
 */
public class UserLoginResponse implements BaseResponse {
    private User user;
    private Token token;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public UserLoginResponse(com.trons.entity.User user, com.trons.entity.Token token) {
        this.user = new User(
                user.getId(),
                user.getStuCode(),
                user.getMobile(),
                user.getName(),
                user.getCollege(),
                user.getMajor(),
                user.getSex(),
                user.getFreeze(),
                user.getCreateAt(),
                user.getUpdateAt()
        );
        this.token = new Token(
                token.getId(),
                token.getIsAdmin(),
                token.getToken(),
                token.getClient(),
                token.getCreateAt(),
                token.getUpdateAt(),
                token.getExpiresAt()
        );
    }

    class Token {
        /**
         * 用户id
         */
        private long id;
        /**
         * 是否管理员
         */
        private boolean isAdmin;
        /**
         * token
         */
        private String token;
        /**
         * 登陆设备
         */
        private String client;
        /**
         * 创建时间
         */
        private long createAt;
        /**
         * 更新时间
         */
        private long updateAt;
        /**
         * 过期时间
         */
        private long expiresAt;



        public Token(long id, boolean isAdmin, String token, String client, long createAt, long updateAt, long expiresAt) {
            this.id = id;
            this.isAdmin = isAdmin;
            this.token = token;
            this.client = client;
            this.createAt = createAt;
            this.updateAt = updateAt;
            this.expiresAt = expiresAt;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public boolean getIsAdmin() {
            return isAdmin;
        }

        public void setIsAdmin(boolean admin) {
            isAdmin = admin;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getClient() {
            return client;
        }

        public void setClient(String client) {
            this.client = client;
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

        public long getExpiresAt() {
            return expiresAt;
        }

        public void setExpiresAt(long expiresAt) {
            this.expiresAt = expiresAt;
        }
    }

    class User {
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
         * 创建时间
         */
        private long createAt;
        /**
         * 更新时间
         */
        private long updateAt;

        public User(long id, String stuCode, String mobile, String name, String college, String major, String sex, boolean freeze, long createAt, long updateAt) {
            this.id = id;
            this.stuCode = stuCode;
            this.mobile = mobile;
            this.name = name;
            this.college = college;
            this.major = major;
            this.sex = sex;
            this.freeze = freeze;
            this.createAt = createAt;
            this.updateAt = updateAt;
        }

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

        public boolean isFreeze() {
            return freeze;
        }

        public void setFreeze(boolean freeze) {
            this.freeze = freeze;
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
}
