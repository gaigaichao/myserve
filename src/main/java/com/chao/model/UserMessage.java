package com.chao.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserMessage {
    private Integer userid;

    private Integer groupId;

    private Integer updaterId;

    private Integer newUserId;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date msgTime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Integer updaterId) {
        this.updaterId = updaterId;
    }

    public Integer getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(Integer newUserId) {
        this.newUserId = newUserId;
    }

    public Date getMsgTime(){
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }
}