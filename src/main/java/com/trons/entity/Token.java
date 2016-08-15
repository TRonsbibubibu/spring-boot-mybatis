package com.trons.entity;

/**
 * Created by trons on 16-8-14.
 * TIME: 上午10:34
 */
public class Token {
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

    public Token() {
    }

    public Token(long id) {
        this.id = id;
    }

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
