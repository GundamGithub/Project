package com.ssm.proj.service.impl;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.entity.user.User;
import com.ssm.proj.mapper.MessageMapper;
import com.ssm.proj.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    MessageMapper messageMapper;

    //查询所有留言
    @Override
    public List<Message> findAllMsg(int page) {
        page=(page-1)*10;
        List<Message> messages = messageMapper.SelectAll(page);
        return messages;
    }

    //根据某个用户的所有留言
    @Override
    public List<Message> findById(int id) {
        List<Message> messages = messageMapper.selectMsgById(id);
        return messages;
    }


    //增加新留言
    @Override
    public int insert(Message message) {

        int insert = messageMapper.insert(message);
        return insert;
    }

    //把留言设为已读
    @Override
    public int SetHaveRead(int mid) {
        int i = messageMapper.UpdateStatus(mid);
        return i;
    }

    @Override
    public int DeleteMsg(int mid) {
        int i = messageMapper.DeleteMsgById(mid);
        return i;
    }

    @Override
    public List<Message> findByContent(String content) {
        List<Message> messages = messageMapper.selectByContentLike(content);
        return messages;
    }


}
