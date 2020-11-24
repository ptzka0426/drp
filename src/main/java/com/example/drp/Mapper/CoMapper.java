package com.example.drp.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drp.Entity.Co;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-23 11:08
 */
@Mapper
public interface CoMapper extends BaseMapper<Co> {
  List<Map<Object,Object>> colist();
}
