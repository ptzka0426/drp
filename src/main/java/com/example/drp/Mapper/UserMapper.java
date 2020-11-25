package com.example.drp.Mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drp.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @Author LT
 * @create 2020-11-20 15:43
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
