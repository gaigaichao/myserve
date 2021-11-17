package com.chao.controller;

import com.github.pagehelper.PageHelper;
import com.chao.model.UserDomain;
import com.chao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(path="/add",method = RequestMethod.POST)
    public int addUser(@RequestBody UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

    //根据user_id查询单个用户
    @ResponseBody
    @GetMapping("/findbyid")
    public Object findUserById(int userId){
        return userService.findUserById(userId);
    }

    //根据user_id修改用户相关信息
    @ResponseBody
    @PutMapping("/updateinfobyid")
    public int updateUser(@RequestBody UserDomain user){
        return userService.updateUser(user);
    }

    //根据user_id删除用户信息
    @ResponseBody
    @DeleteMapping("/deleteuserbyid")
    public int deleteUser(int userId){
        return userService.deleteUserById(userId);
    }
}


