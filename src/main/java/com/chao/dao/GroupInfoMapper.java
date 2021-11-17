package com.chao.dao;

import com.chao.model.GroupInfo;
import org.apache.ibatis.annotations.Param;

public interface GroupInfoMapper {

    //创建新群组
    int insert(GroupInfo record);

    //删除群组
    int deleteByPrimaryKey(@Param("groupId") Integer groupId,@Param("userId") Integer userId);

    //修改群组
    int updateByPrimaryKeySelective(GroupInfo record);

    //查询群组
    GroupInfo selectByPrimaryKey(int groupId);

    //邀请后群组人数增加
    int addGroupNum(@Param("groupId") Integer groupId,@Param("invitedNum") Integer invitedNum);

//    int updateByPrimaryKeySelective(GroupInfo record);
//    int insertSelective(GroupInfo record);
}