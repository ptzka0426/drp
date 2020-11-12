package com.example.drp.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drp.Entity.jcb_lottery_data;
import com.example.drp.Mapper.jcd_data;
import com.example.drp.Server.jcd_data_server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author LT
 * @create 2020-11-11 18:04
 */
@Service
@AutoConfigureAfter({jcd_data.class})
public class jcd_data_serverimpl extends ServiceImpl<jcd_data, jcb_lottery_data> implements  jcd_data_server{
    @Autowired
    private jcd_data jcb_data;
}
