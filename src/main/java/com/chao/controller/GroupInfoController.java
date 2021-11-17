package com.chao.controller;

import com.chao.model.GroupInfo;
import com.chao.service.GroupInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping(value = "/groupinfo")
public class GroupInfoController {

    @Autowired
    private GroupInfoService groupInfoService;


    //创建新群组
    @ResponseBody
    @PostMapping(value = "/creategroup")
    public int createGroup(@RequestBody GroupInfo groupInfo){
        return groupInfoService.createGroup(groupInfo);
    }

    //删除群组
    @ResponseBody
    @DeleteMapping("/deletegroup")
    public int deleteGroup(@RequestParam(name = "groupId", required = true) int groupId,
                           @RequestParam(name = "userId", required = true) int userId){
        System.out.println(groupId);
        System.out.println(userId);
        return groupInfoService.deleteGroup(groupId, userId);
    }

    //修改群组
    @ResponseBody
    @PutMapping("/updategroup")
    public int updateGroup(@RequestBody GroupInfo groupInfo){
        return groupInfoService.updateGroup(groupInfo);
    }

    //查询群组
    @ResponseBody
    @GetMapping("/selectgroup")
    public GroupInfo selectGroup(@RequestParam(name = "groupId", required = true) int groupId){
        return groupInfoService.selectGroup(groupId);
    }

    //邀请人后群组人数增加
    @ResponseBody
    @PutMapping(value = "/addgroupnum")
    public int addGroupNum(@RequestParam(name = "groupId", required = true) int groupId,
                           @RequestParam(name = "invitedNum", required = true) int invitedNum){
        return groupInfoService.addGroupNum(groupId, invitedNum);
    }
}
