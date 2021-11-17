package com.chao.dao;

import com.chao.model.UserMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMessageMapper {
    int insert(UserMessage record);

    List<UserMessage> selectbyuserid(@Param("userId") Integer userId,@Param("pageNum") Integer pageNum,
                                     @Param("pageSize")  Integer pageSize);

    List<UserMessage> selectbygroupid(@Param("groupId") Integer groupId,@Param("pageNum") Integer pageNum,
                                      @Param("pageSize")  Integer pageSize);

    List<UserMessage> selectbyupdateidgroupid(@Param("updaterId") Integer updaterId
                                        ,@Param("groupId") Integer groupId
                                        ,@Param("pageNum") Integer pageNum,
                                      @Param("pageSize")  Integer pageSize);

    String selectbynewuseridgroupid(@Param("newUserId") Integer newUserId,@Param("groupId") Integer groupId);

//    int insertSelective(UserMessage record);
}