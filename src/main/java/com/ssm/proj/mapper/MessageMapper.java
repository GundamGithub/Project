package com.ssm.proj.mapper;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    //查看所有留言功能
    List<Message> SelectAll(@Param("page") int page);

    //用户添加留言
    int insert(@Param("message") Message message);

    //将留言设为已阅
    int UpdateStatus(@Param("mid") int mid);



}