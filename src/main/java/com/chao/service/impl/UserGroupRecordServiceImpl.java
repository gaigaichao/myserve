package com.chao.service.impl;


import com.chao.dao.UserGroupRecordMapper;
import com.chao.model.UserGroupRecord;
import com.chao.service.UserGroupRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupRecordServiceImpl implements UserGroupRecordService{

    @Autowired
    private UserGroupRecordMapper userGroupRecordMapper;

    @Override
    public int addUgpRecord(UserGroupRecord userGroupRecord){
        return userGroupRecordMapper.insertRecord(userGroupRecord);
    }

    @Override
    public int deleteUgpRecord(UserGroupRecord userGroupRecord){
        return userGroupRecordMapper.deleteRecord(userGroupRecord);
    }

    @Override
    public PageInfo<UserGroupRecord> findRecordByUserId(int userId, int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<UserGroupRecord> userGroupRecords = userGroupRecordMapper.findRecordByUserId(userId, pageNum, pageSize);
        PageInfo result = new PageInfo(userGroupRecords);
        return result;
    }
}
