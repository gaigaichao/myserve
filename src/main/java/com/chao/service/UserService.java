package com.chao.service;

import com.github.pagehelper.PageInfo;
import com.chao.model.UserDomain;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 */

public interface UserService {

    int addUser(UserDomain user);

    int updateUser(UserDomain user);

    UserDomain findUserById (int userId);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);

    int deleteUserById(int userId);
}


