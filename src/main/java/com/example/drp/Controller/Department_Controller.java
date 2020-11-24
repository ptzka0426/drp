package com.example.drp.Controller;

import com.example.drp.Entity.Department;
import com.example.drp.Server.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Author LT
 * @create 2020-11-23 17:43
 */
@RequestMapping
public class Department_Controller {
    @Autowired
    private DepartmentServer departmentServer;

    //新增
    @RequestMapping("/Department/api/add")
    public boolean save(Department deprecated) {
        deprecated.setDupdate(new Date());
        deprecated.setDflag('0');
        deprecated.setDjur(2);
        departmentServer.save(deprecated);
        return true;
    }

}

