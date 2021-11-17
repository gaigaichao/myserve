package com.chao.service;

import com.chao.model.UserLoginInfo;

public interface UserLoginService {
    //查询用户密码
    UserLoginInfo getPassword(String user);

    //注册新用户
    int registUser(UserLoginInfo user);

    //删除用户
    int deleteUser(int userId);

    //修改用户密码
    int reviseUser(UserLoginInfo user);
}
