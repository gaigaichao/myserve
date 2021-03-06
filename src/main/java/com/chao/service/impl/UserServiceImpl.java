package com.chao.service.impl;

import com.chao.dao.UserDomainMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.chao.model.UserDomain;
import com.chao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDomainMapper userDomainMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(UserDomain user) {
        return userDomainMapper.insert(user);
    }

    @Override
    public UserDomain findUserById(int selectId) {
        UserDomain result = userDomainMapper.selectUserById(selectId);
        return result;
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDomainMapper.selectUsers(pageNum,pageSize);
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    @Override
    public int updateUser(UserDomain user) {
        return userDomainMapper.updateinfobyid(user);
    }

    @Override
    public  int deleteUserById(int userId) {
        return userDomainMapper.deleteuserbyid(userId);
    }
}


