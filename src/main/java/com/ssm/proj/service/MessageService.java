package com.ssm.proj.service;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;

import java.util.List;

public interface MessageService {
    public List<Message> findAllMsg(int page);

    public List<Message> findById(int id);


    public int insert(Message message);




    public int SetHaveRead(int mid);


    public int DeleteMsg(int mid);


}
