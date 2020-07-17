package com.ssm.proj.service.impl;

import com.ssm.proj.entity.message.Message;
import com.ssm.proj.mapper.MessageMapper;
import com.ssm.proj.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml"})
public class MessageServiceImplTest {

    @Resource
    MessageService messageService;


    @Test
    public void findAllMsg() {
        List<Message> allMsg = messageService.findAllMsg(1);
        System.out.println(allMsg);


    }
}