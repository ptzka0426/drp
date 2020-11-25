package com.example.drp.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drp.Entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 17:38
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
    List<Map<String,Object>> bumen(int coid);
    List<Map<String,Object>> zhuguan(int coid);
}
