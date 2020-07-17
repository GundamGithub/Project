package com.ssm.proj.service;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;

public interface MessageService {

    public int insert(Message message);


    public int SetHaveRead(int mid);





}
