package com.chao.service;


import com.chao.model.GroupInfo;



public interface GroupInfoService {

    //创建新群组
    int createGroup(GroupInfo groupInfo);

    //删除群组--只限于创建者删除
    int deleteGroup(int groupId, int userId);

    //修改群组--都可以修改
    int updateGroup(GroupInfo groupInfo);

    //查询群组信息
    GroupInfo selectGroup(int groupId);

    //邀请后群组人数增多
    int addGroupNum(int groupId, int invitedNum);
}
