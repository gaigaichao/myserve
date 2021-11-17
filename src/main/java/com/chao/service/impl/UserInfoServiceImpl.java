package com.chao.service.impl;


import com.chao.dao.UserInfoMapper;
import com.chao.model.UserInfo;
import com.chao.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int addUserInfo(UserInfo u){
        return userInfoMapper.insert(u);
    }

    @Override
    public UserInfo getUserInfo(int userId){
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int reviseUserInfo(UserInfo u){
        return userInfoMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public int deleteUserInfo(int userId){
        return userInfoMapper.deleteByPrimaryKey(userId);
    }
}
