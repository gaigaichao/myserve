package com.chao.dao;

import com.chao.model.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDomainMapper {
    int insert(UserDomain record);

    UserDomain selectUserById(int selectId);

    List<UserDomain> selectUsers(@Param("pageNum") Integer pageNum,
                                 @Param("pageSize")  Integer pageSize);

    int updateinfobyid(UserDomain record);

    int deleteuserbyid(int userId);
}