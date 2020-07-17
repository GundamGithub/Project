package com.ssm.proj.mapper;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    //用户添加留言
    int insert(@Param("message") Message message);

    //将留言设为已阅
    int UpdateStatus(@Param("mid") int mid);

}