package com.chao.service;

import com.chao.model.UserInfo;

public interface UserInfoService {

    int addUserInfo(UserInfo u);

    UserInfo getUserInfo(int userId);

    int reviseUserInfo(UserInfo u);

    int deleteUserInfo(int userId);

}
