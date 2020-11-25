package com.example.drp.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drp.Entity.User;
import com.example.drp.Mapper.UserMapper;
import com.example.drp.Server.User_Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;


/**
 * @Author LT
 * @create 2020-11-20 15:44
 */
@Service
@AutoConfigureAfter({UserMapper.class})
public class User_ServerImpl extends ServiceImpl<UserMapper, User> implements User_Server {
    @Autowired
    private UserMapper userMapper;

/*    @Override
    public Object doLogin(String yhm, String password, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("uuser", yhm);
        map.put("upassword", password);
        List<User> user = (List<User>) userMapper.selectByMap(map);
        // 将登录用户信息保存到session中
        session.setAttribute(Const.SYSTEM_USER_SESSION, user);
        // 保存cookie，实现自动登录
        Cookie cookie_username = new Cookie("cookie_username", yhm);
        // 设置cookie的持久化时间，30天
        cookie_username.setMaxAge(30 * 24 * 60 * 60);
        // 设置为当前项目下都携带这个cookie
        cookie_username.setPath(request.getContextPath());
        // 向客户端发送cookie
        response.addCookie(cookie_username);
        if(user.size()==0){
            return 0;
        }else{
            return user;
        }
    }*/
}
