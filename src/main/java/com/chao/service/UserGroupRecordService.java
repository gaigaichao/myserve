package com.chao.service;

import com.chao.model.UserGroupRecord;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserGroupRecordService {

    //组关系中添加记录
    int addUgpRecord(UserGroupRecord userGroupRecord);

    //组关系中删除记录
    int deleteUgpRecord(UserGroupRecord userGroupRecord);

    //组关系中查询记录
    PageInfo<UserGroupRecord> findRecordByUserId(int userId,int pageNum,int pageSize);


}
