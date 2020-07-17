package com.ssm.proj.entity.message;

import java.util.Date;
import lombok.Data;

@Data
public class Message {
    private Integer id;

    private String username;

    private String content;

    private Date data;


    private Integer status;


    private Integer isdel;

    private String type;

    private Integer mid;


}