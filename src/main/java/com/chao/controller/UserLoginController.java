package com.chao.controller;


import com.chao.model.UserLoginInfo;
import com.chao.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/login")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    //登陆验证接口
    @ResponseBody
    @GetMapping(value = "/verify")
    public Object getPassword(String user) {
        return userLoginService.getPassword(user);
    }

    //用户注册接口
    @ResponseBody
    @PostMapping(value = "/regist")
    public int registUser(@RequestBody UserLoginInfo user) {
        return userLoginService.registUser(user);
    }

    //用户注销接口
    @ResponseBody
    @DeleteMapping(value = "/delete")
    public int deleteUser(int userId) {
        return userLoginService.deleteUser(userId);
    }

    //用户修改接口
    @ResponseBody
    @PutMapping(value = "/revise")
    public int reviseUser(@RequestBody UserLoginInfo user) {
        return userLoginService.reviseUser(user);
    }
}
