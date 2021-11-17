package com.chao.service.impl;

import com.chao.dao.UserLoginInfoMapper;
import com.chao.model.UserLoginInfo;
import com.chao.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "userLoginService")
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginInfoMapper userLoginInfoMapper;

    @Override
    public UserLoginInfo getPassword(String user){
        return userLoginInfoMapper.selectByUser(user);
    }

    @Override
    public int registUser(UserLoginInfo user){
        return userLoginInfoMapper.insertSelective(user);
    }

    @Override
    public int deleteUser(int userId){
        return userLoginInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public  int reviseUser(UserLoginInfo user){
        return userLoginInfoMapper.updateByPrimaryKeySelective(user);
    }
}
