package com.chao.dao;

import com.chao.model.UserLoginInfo;

//用户登录接口层
public interface UserLoginInfoMapper {

    //删除
    int deleteByPrimaryKey(Integer userId);

//    int insert(UserLoginInfo record);
    //新增
    int insertSelective(UserLoginInfo record);

    //验证
    UserLoginInfo selectByUser(String user);

    //修改
    int updateByPrimaryKeySelective(UserLoginInfo record);

//    int updateByPrimaryKey(UserLoginInfo record);
}