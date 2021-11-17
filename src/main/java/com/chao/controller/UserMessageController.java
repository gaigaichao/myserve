package com.chao.controller;


import com.chao.model.UserMessage;
import com.chao.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usermessage")
public class UserMessageController {
    @Autowired
    private UserMessageService userMessageService;

    //新增用户消息
    @ResponseBody
    @PostMapping("/newmessage")
    public int newMessage(@RequestBody UserMessage msg){
//        System.out.println(msg.getGroupId());
        return userMessageService.newMessage(msg);
    }

    //根据userId查询有关用户消息
    @ResponseBody
    @GetMapping("/findmessagebyuserid")
    public Object findMessageByUserId(@RequestParam(name = "userId", required = true) int userId,
                                    @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                    int pageNum,
                                    @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                    int pageSize){
        return userMessageService.findMessageByUserId(userId,pageNum,pageSize);
    }

    //根据group查询有关组信息
    @ResponseBody
    @GetMapping("/findmessagebygroupid")
    public Object findMessageByGroupId(@RequestParam(name = "groupId", required = true) int groupId,
                                      @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                              int pageNum,
                                      @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                              int pageSize){
        return userMessageService.findMessageByGroupId(groupId,pageNum,pageSize);
    }

    //根据修改人（updater_id）和组(group_id) 查询被邀请人
    @ResponseBody
    @GetMapping("/findmessagebyupdateidgroupid")
    public Object findMessageByUpdaterIdGroupId(@RequestParam(name = "updaterId", required = true) int updaterId,
                                        @RequestParam(name = "groupId", required = true) int groupId,
                                       @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                               int pageNum,
                                       @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                               int pageSize){
        return userMessageService.findMessageByUpdateIdGroupId(updaterId,groupId,pageNum,pageSize);
    }

    //根据修改人（new_user_id）和组(group_id) 查询邀请人
    @ResponseBody
    @GetMapping("/findmessagebynewuseridgroupid")
    public Object findMessageBynewuseridGroupId(int newUserId, int groupId){
        return userMessageService.findMessageByNewUserIdGroupId(newUserId,groupId);
    }
}
