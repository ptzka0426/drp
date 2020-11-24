package com.example.drp.Controller;

import com.example.drp.Entity.User;
import com.example.drp.Server.User_Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author LT
 * @create 2020-11-20 16:00
 */
@RestController
public class User_Controller {
    @Autowired
    private User_Server user_server;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public int login(String yhm, String password, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("uuser", yhm);
        map.put("upassword", password);
        List<User> user = (List<User>) user_server.listByMap(map);
        if (user.size() == 0) {
            return 0;
        } else {
            System.out.println(user.get(0));
            remember(response, user.get(0));
            return 1;
        }
    }

    public void remember(HttpServletResponse response, User user) {
        //存入一个cookie 用户名为键，生成一个专属session；在session中存入user以后的信息
        Cookie Cookie = new Cookie(user.getUuser(), user.getUpassword());
        response.addCookie(Cookie);
        Cookie.setMaxAge(7 * 24 * 60 * 60);
    }
}
