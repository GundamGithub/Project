package com.ssm.proj.mapper;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface MessageMapper {
    //查看所有留言功能
    List<Message> SelectAll(@Param("page") int page);

    //用户添加留言
    int insert(@Param("message") Message message);

    //将留言设为已阅
    int UpdateStatus(@Param("mid") int mid);


    //删除留言
    int DeleteMsgById(@Param("mid") int mid);


    //查询个人所有留言
    List<Message> selectMsgById(@Param("id") int id);

    //动态sql  根据两个条件动态查询留言信息
//    List<Message> selectMsgByMsgOrDate(@Param("Msg")String content, @Param("Date") Date date);


    //根据留言内容模糊查询
    List<Message> selectByContentLike(@Param("content") String content);

    //查询单挑留言
    Message selectByMid(@Param("mid") int mid);





}