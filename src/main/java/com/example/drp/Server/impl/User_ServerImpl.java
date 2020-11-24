package com.example.drp.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drp.Entity.User;
import com.example.drp.Mapper.UserMapper;
import com.example.drp.Server.User_Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

/**
 * @Author LT
 * @create 2020-11-20 15:44
 */
@Service
@AutoConfigureAfter({UserMapper.class})
public class User_ServerImpl extends ServiceImpl<UserMapper, User> implements User_Server {
    @Autowired
    private UserMapper userMapper;
}
