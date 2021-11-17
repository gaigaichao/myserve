package com.chao.service;

import com.chao.model.UserMessage;
import com.github.pagehelper.PageInfo;

public interface UserMessageService {

    //新增用户消息
    int newMessage(UserMessage msg);

    //根据userId查询消息
    PageInfo<UserMessage> findMessageByUserId(int userId,int pageNum,int pageSize);

    //根据groupId查询消息
    PageInfo<UserMessage> findMessageByGroupId(int groupId,int pageNum,int pageSize);

    //根据updateId和groupId查询被邀请人
    PageInfo<UserMessage> findMessageByUpdateIdGroupId(int updaterId,int groupId,int pageNum,int pageSize);

    //根据newUserId和groupId查询邀请人
    String findMessageByNewUserIdGroupId(int newUserId, int groupId);
}
