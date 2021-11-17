package com.chao.model;

import java.util.Date;

public class GroupInfo {
    private Integer groupId;

    private String groupName;

    private String groupCrter;

    private String groupDetil;

    private Integer groupUsernum;

    private Date groupCrt;

    private Date groupUdt;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupCrter() {
        return groupCrter;
    }

    public void setGroupCrter(String groupCrter) {
        this.groupCrter = groupCrter == null ? null : groupCrter.trim();
    }

    public String getGroupDetil() {
        return groupDetil;
    }

    public void setGroupDetil(String groupDetil) {
        this.groupDetil = groupDetil == null ? null : groupDetil.trim();
    }

    public Integer getGroupUsernum() {
        return groupUsernum;
    }

    public void setGroupUsernum(Integer groupUsernum) {
        this.groupUsernum = groupUsernum;
    }

    public Date getGroupCrt() {
        return groupCrt;
    }

    public void setGroupCrt(Date groupCrt) {
        this.groupCrt = groupCrt;
    }

    public Date getGroupUdt() {
        return groupUdt;
    }

    public void setGroupUdt(Date groupUdt) {
        this.groupUdt = groupUdt;
    }
}