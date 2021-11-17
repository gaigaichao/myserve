package com.chao.service.impl;

import com.chao.dao.UserMessageMapper;
import com.chao.model.UserMessage;
import com.chao.service.UserMessageService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "userMessageService")
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private UserMessageMapper userMessageMapper;

    @Override
    public int newMessage(UserMessage msg) {
        return userMessageMapper.insert(msg);
    }

    @Override
    public PageInfo<UserMessage> findMessageByUserId(int userId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserMessage> userMessages = userMessageMapper.selectbyuserid(userId, pageNum, pageSize);
        PageInfo result = new PageInfo(userMessages);
        return result;
    }

    @Override
    public PageInfo<UserMessage> findMessageByGroupId(int groupId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserMessage> userMessages = userMessageMapper.selectbygroupid(groupId, pageNum, pageSize);
        PageInfo result = new PageInfo(userMessages);
        return result;
    }

    @Override
    public PageInfo<UserMessage> findMessageByUpdateIdGroupId(int updaterId,int groupId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserMessage> userMessages = userMessageMapper.selectbyupdateidgroupid(updaterId, groupId, pageNum, pageSize);
        PageInfo result = new PageInfo(userMessages);
        return result;
    }

    @Override
    public String findMessageByNewUserIdGroupId(int newUserId, int groupId){
        return userMessageMapper.selectbynewuseridgroupid(newUserId,groupId);
    }

}