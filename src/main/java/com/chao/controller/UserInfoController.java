package com.chao.controller;


import com.chao.model.Picture;
import com.chao.model.UserInfo;
import com.chao.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
@RequestMapping(value = "/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //增加用户信息
    @ResponseBody
    @PostMapping(value = "/adduserinfo")
    public int addUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.addUserInfo(userInfo);
    }

    //删除用户信息
    @ResponseBody
    @DeleteMapping(value = "/deleteuserinfo")
    public int deleteUserInfo(int userId) {
        return userInfoService.deleteUserInfo(userId);
    }

    //修改用户信息
    @ResponseBody
    @PutMapping(value = "/reviseuserinfo")
    public int reviseUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.reviseUserInfo(userInfo);
    }

    //查询用户信息
    @ResponseBody
    @GetMapping(value = "/getuserinfo")
    public UserInfo getUserInfo(int userId) {
        return userInfoService.getUserInfo(userId);
    }
}
