package com.example.drp.Server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drp.Entity.Department;

import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 17:39
 */
public interface DepartmentServer extends IService<Department> {
    List<Map<String,Object>> bumen(int coid);
    List<Map<String,Object>> zhuguan(int coid);

}
