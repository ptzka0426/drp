package com.example.drp.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drp.Entity.Department;
import com.example.drp.Mapper.DepartmentMapper;
import com.example.drp.Server.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

/**
 * @Author LT
 * @create 2020-11-23 17:40
 */
@Service
@AutoConfigureAfter({DepartmentMapper.class})
public class DepartmentServerImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentServer {
    @Autowired
    private DepartmentMapper departmentMapper;
}
