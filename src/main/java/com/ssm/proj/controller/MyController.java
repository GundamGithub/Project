package com.ssm.proj.controller;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import com.ssm.proj.service.MessageService;
import com.ssm.proj.service.UserService;
import com.ssm.proj.service.impl.MessageServiceImpl;
import org.apache.ibatis.annotations.Arg;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class MyController {

    @Resource
    MessageService messageService;

    @Resource
    UserService userService;


    @PostMapping(value = "NewMsg",produces = "application/json" )
    //插入新留言
    public String NewMessage(@RequestParam(value = "id") int id, @RequestBody Message message){
        User byId = userService.findById(id);
        message.setId(byId.getId());
        message.setUsername(byId.getUsername());

        System.out.println(message);
        int insert = messageService.insert(message);
        return insert>0?"Success":"The network is busy ";


    }


    //将留言设为已读
    @RequestMapping("/SetHaveRead")
    public String SetHaveRead(@RequestParam(value = "mid") int mid){
        int i = messageService.SetHaveRead(mid);
        return i>0?"success":"failure";

    }






}
