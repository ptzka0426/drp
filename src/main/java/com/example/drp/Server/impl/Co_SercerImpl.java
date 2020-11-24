package com.example.drp.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drp.Entity.Co;
import com.example.drp.Mapper.CoMapper;
import com.example.drp.Server.Co_Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 11:15
 */
@Service
@AutoConfigureAfter({CoMapper.class})
public class Co_SercerImpl extends ServiceImpl<CoMapper, Co> implements Co_Server {
    @Autowired
    private  CoMapper coMapper;
    @Override
    public List<Map<Object,Object>> colist() {
        return coMapper.colist();
    }
}
