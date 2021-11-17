package com.chao.model;

public class UserInfo {
    private Integer userId;

    private String userName;

//    private byte[] userImg;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

//    public byte[] getUserImg() {
//        return userImg;
//    }
//
//    public void setUserImg(byte[] userImg) {
//        this.userImg = userImg;
//    }
}