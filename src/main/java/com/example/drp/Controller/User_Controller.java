package com.example.drp.Controller;

import com.example.drp.Entity.User;
import com.example.drp.Server.User_Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(String yhm, String password, HttpServletResponse response, HttpServletRequest request) {
       /* Map<String, Object> map = new HashMap<String, Object>();
        map.put("uuser", yhm);
        map.put("upassword", password);
        List<User> user = (List<User>) user_server.listByMap(map);*/
        /* if (user.size() != 0) {*/
        User user = new User();
        user.setUname(yhm);
        user.setUpassword(password);
        return remember(response, request, user);
       /*     return user.get(0);
        } else {
            return 0;
        }*/
    }

    /**
     * 执行登录  cookie未解决
     */
   /* @PostMapping("logins")
    @ResponseBody
    public Object login(String username, String password, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        return user_server.doLogin(username.trim(), password.trim(), session, request, response);
    }*/
    public int remember(HttpServletResponse response, HttpServletRequest request, User user) {
        //存入一个cookie 用户名为键，生成一个专属session；在session中存入user以后的信息
        //Cookie Cookie = new Cookie(user.getUuser(), user.getUpassword());
        Cookie[] cookies = request.getCookies();
        // 没有cookie信息，则重定向到登录界面
        if (null == cookies) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("uuser", user.getUname());
            map.put("upassword", user.getUpassword());
            List<User> users = (List<User>) user_server.listByMap(map);
            if (users != null&&users.size()!=0) {
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(30 * 60);
                session.setAttribute(session.getId(), users);
                Cookie Cookie = new Cookie(users.get(0).getUuser(), session.getId());//创建cookie
                Cookie.setMaxAge(7 * 24 * 60 * 60);//时间
                response.addCookie(Cookie);//发送cookie
                return 1;
            }
            return 0;
        } else {
            String yhm = "";
            for (Cookie item : cookies) {
                if (user.getUname().equals(item.getName())) {
                    yhm = item.getValue();
                    break;
                }
            }
            if (yhm.equals("")) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("uuser", user.getUname());
                map.put("upassword", user.getUpassword());
                List<User> users = (List<User>) user_server.listByMap(map);
                if (users != null&&users.size()!=0) {
                    HttpSession session = request.getSession();
                    session.setMaxInactiveInterval(30 * 60);
                    session.setAttribute(session.getId(), users);
                    Cookie Cookie = new Cookie(users.get(0).getUuser(), session.getId());//创建cookie
                    Cookie.setMaxAge(7 * 24 * 60 * 60);//时间
                    response.addCookie(Cookie);//发送cookie
                    return 1;
                } else {
                    return 0;
                }
            }
            HttpSession sessions = request.getSession();
            // 获取我们登录后存在session中的用户信息，如果为空，表示session已经过期
            /*System.out.println(yhm);*/
            List<User> obj = (List<User>) sessions.getAttribute(yhm);
            if (null == obj) {
                // 根据用户登录账号获取数据库中的用户信息
                Map<String, Object> map = new HashMap<>();
                map.put("uuser", user.getUname());
                map.put("upassword", user.getUpassword());
                List<User> users = (List<User>) user_server.listByMap(map);
                // 将用户保存到session中
               /* System.out.println(users.size());*/
                if (users != null&&users.size()!=0) {
                    sessions.setAttribute(yhm, users);
                    sessions.setMaxInactiveInterval(30 * 60);
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (obj.get(0).getUuser().equals(user.getUname()) && obj.get(0).getUpassword().equals(user.getUpassword())) {
                    return 1;
                }
                return 0;
            }
            /*HttpSession session = request.getSession();
            session.setMaxInactiveInterval(30 * 60);
            session.setAttribute(session.getId(), user);
            Cookie Cookie = new Cookie(user.getUuser(), session.getId());//创建cookie
            Cookie.setMaxAge(7 * 24 * 60 * 60);//时间
            response.addCookie(Cookie);//发送cookie*/
        }
    }
}
