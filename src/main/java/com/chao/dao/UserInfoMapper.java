package com.chao.dao;

import com.chao.model.UserInfo;

public interface UserInfoMapper {

    //根据userId删除用户信息
    int deleteByPrimaryKey(Integer userId);

    //根据用户userId增加用户信息
    int insert(UserInfo record);

//    int insertSelective(UserInfo record);

    //根据用户userId获取用户信息
    UserInfo selectByPrimaryKey(Integer userId);

    //根据用户userId修改用户信息
    int updateByPrimaryKeySelective(UserInfo record);

//    int updateByPrimaryKeyWithBLOBs(UserInfo record);

//    int updateByPrimaryKey(UserInfo record);
}