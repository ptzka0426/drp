package com.example.drp.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drp.Entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author LT
 * @create 2020-11-20 15:43
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
