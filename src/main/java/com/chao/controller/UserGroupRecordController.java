package com.chao.controller;


import com.chao.model.UserGroupRecord;
import com.chao.service.UserGroupRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/usergrouprecord")
public class UserGroupRecordController {

    @Autowired
    private UserGroupRecordService userGroupRecordService;

    //组关系中添加记录
    @ResponseBody
    @PostMapping(value = "/addnewrecord")
    public int addNewRecord(@RequestBody UserGroupRecord userGroupRecord){
        return userGroupRecordService.addUgpRecord(userGroupRecord);
    }

    //组关系中删除记录
    @ResponseBody
    @DeleteMapping(value = "/deleterecord")
    public int deleteRecord(@RequestBody UserGroupRecord userGroupRecord){
        return userGroupRecordService.deleteUgpRecord(userGroupRecord);
    }

    //组关系中查询记录
    @ResponseBody
    @GetMapping(value = "/findrecords")
    public Object findRecords(@RequestParam(name = "userId", required = true) int userId,
                              @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                      int pageNum,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                          int pageSize){
        return userGroupRecordService.findRecordByUserId(userId, pageNum, pageSize);
    }

}
