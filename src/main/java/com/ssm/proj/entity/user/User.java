package com.ssm.proj.entity.user;

import com.ssm.proj.entity.message.Message;
import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;

//    private List<Message> messages;


}
