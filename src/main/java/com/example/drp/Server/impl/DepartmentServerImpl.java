package com.example.drp.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drp.Entity.Department;
import com.example.drp.Mapper.DepartmentMapper;
import com.example.drp.Server.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 17:40
 */
@Service
@AutoConfigureAfter({DepartmentMapper.class})
public class DepartmentServerImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentServer {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Map<String, Object>> bumen(int coid) {
        return departmentMapper.bumen(coid);
    }

    @Override
    public List<Map<String, Object>> zhuguan(int coid) {
        return departmentMapper.zhuguan(coid);
    }
}
