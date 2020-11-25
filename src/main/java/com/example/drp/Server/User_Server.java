package com.example.drp.Server;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drp.Entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author LT
 * @create 2020-11-20 15:43
 */
public interface User_Server extends IService<User> {
    /* Object doLogin(String yhm, String password, HttpSession session, HttpServletRequest request, HttpServletResponse response);*/
}
