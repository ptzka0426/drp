package com.example.drp.Controller;

import com.example.drp.Entity.Department;
import com.example.drp.Server.DepartmentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 17:43
 */
@RestController
public class Department_Controller {
    @Autowired
    private DepartmentServer departmentServer;

    //新增
    @RequestMapping(value = "/Department/api/add", method = RequestMethod.POST)
    public boolean save(Department deprecated) {
        deprecated.setDupdate(new Date());
        deprecated.setDflag('0');//删除标志
        deprecated.setDjur(2);//权限
        departmentServer.save(deprecated);
        return true;
    }

    //查询所以的部门
    @RequestMapping(value = "/Department/api/listbumen", method = RequestMethod.POST)
    public List<Map<String, Object>> list(int coid) {
        return departmentServer.bumen(coid);
    }
    @RequestMapping(value = "/Department/api/listzhuguan", method = RequestMethod.POST)
    public List<Map<String, Object>> listzhuguan(int coid) {
        return departmentServer.zhuguan(coid);
    }

}

