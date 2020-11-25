package com.example.drp.Server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drp.Entity.Co;

import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 11:13
 */
public interface Co_Server extends IService<Co> {
    List<Map<Object,Object>> colist();
    int size();
}
