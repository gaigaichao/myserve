package com.chao.service.impl;

import com.chao.dao.GroupInfoMapper;
import com.chao.model.GroupInfo;
import com.chao.service.GroupInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GroupInfoServiceImpl implements GroupInfoService {

    @Autowired
    private GroupInfoMapper groupInfoMapper;

    @Override
    public int createGroup(GroupInfo groupInfo){
        return groupInfoMapper.insert(groupInfo);
    }

    @Override
    public int deleteGroup(int groupId, int userId){
        return groupInfoMapper.deleteByPrimaryKey(groupId, userId);
    }

    @Override
    public int updateGroup(GroupInfo groupInfo){
        return groupInfoMapper.updateByPrimaryKeySelective(groupInfo);
    }

    @Override
    public GroupInfo selectGroup(int groupId){
        return groupInfoMapper.selectByPrimaryKey(groupId);
    }

    @Override
    public int addGroupNum(int groupId, int invitedNum){
        return groupInfoMapper.addGroupNum(groupId, invitedNum);
    }
}
