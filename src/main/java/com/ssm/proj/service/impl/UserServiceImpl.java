package com.ssm.proj.service.impl;

import com.ssm.proj.entity.user.User;
import com.ssm.proj.mapper.UserMapper;
import com.ssm.proj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;


    @Override
    public User findById(int id) {
        User user = userMapper.SelectById(id);
        return user;


    }
}
