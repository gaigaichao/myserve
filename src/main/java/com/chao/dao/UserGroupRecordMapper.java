package com.chao.dao;

import com.chao.model.UserGroupRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupRecordMapper {

    //组关系中添加记录
    int insertRecord(UserGroupRecord userGroupRecord);

    //组关系中删除记录
    int deleteRecord(UserGroupRecord userGroupRecord);

    //组关系中查询记录
    List<UserGroupRecord> findRecordByUserId(@Param("userId") Integer userId, @Param("pageNum") Integer pageNum,
                                             @Param("pageSize")  Integer pageSize);
}