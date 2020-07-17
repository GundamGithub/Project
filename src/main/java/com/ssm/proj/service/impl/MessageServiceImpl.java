package com.ssm.proj.service.impl;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import com.ssm.proj.mapper.MessageMapper;
import com.ssm.proj.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    MessageMapper messageMapper;


    @Override
    public int insert(Message message) {

        int insert = messageMapper.insert(message);
        return insert;
    }

    @Override
    public int SetHaveRead(int mid) {
        int i = messageMapper.UpdateStatus(mid);
        return i;
    }


}
