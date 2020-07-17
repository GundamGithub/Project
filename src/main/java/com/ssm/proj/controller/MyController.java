package com.ssm.proj.controller;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import com.ssm.proj.service.MessageService;
import com.ssm.proj.service.UserService;
import com.ssm.proj.service.impl.MessageServiceImpl;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyController {

    @Resource
    MessageService messageService;

    @Resource
    UserService userService;


    //查询所有留言
    @RequestMapping(value = "allMsg",produces = "application/json")
    public List<Message> AllMsg(@RequestParam("page") int page){
        List<Message> allMsg = messageService.findAllMsg(page);
        return allMsg;
    }



    //查询个人所有留言
    @RequestMapping(value = "personMsg",produces ="application/json" )
    public List<Message> PersonMsg(@RequestParam("id") int id){
        List<Message> byId = messageService.findById(id);
        return byId;

    }


    //根据留言内容模糊查询
    @RequestMapping(value = "contentLike",produces ="application/json")
    public List<Message> ContentLike(@RequestParam("content") String content){
        List<Message> byContent = messageService.findByContent(content);
        return byContent;
    }



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


    //将留言删除
    @RequestMapping("/delete")
    public String DeleteMsg(@RequestParam(value = "mid") int mid){
        int i = messageService.DeleteMsg(mid);
        return i>0?"delete success":"failure";
    }

}
