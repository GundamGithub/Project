package com.ssm.proj.mapper;

import com.ssm.proj.entity.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //根据id查找到用户  (用于登录 查找信息配合其他业务等)
    User SelectById(@Param("id") int id);


}
