package com.example.drp.Interceptor;

/**
 * @Author LT
 * @create 2020-11-24 18:47
 */


import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 未登录拦截器
 */
/*@Component*/
public class LoginInterceptor implements HandlerInterceptor {

   /* @Autowired
    private User_Server User_Server;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获得cookie
        Cookie[] cookies = request.getCookies();
        // 没有cookie信息，则重定向到登录界面
        if (null == cookies) {
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
        // 定义cookie_username，用户的一些登录信息，例如：用户名，密码等
        String cookie_username = null;
        // 获取cookie里面的一些用户信息
        for (Cookie item : cookies) {
            if ("cookie_username".equals(item.getName())) {
                cookie_username = item.getValue();
                break;
            }
        }
        // 如果cookie里面没有包含用户的一些登录信息，则重定向到登录界面
        if (StringUtils.isEmpty(cookie_username)) {
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
        // 获取HttpSession对象
        HttpSession session = request.getSession();
        // 获取我们登录后存在session中的用户信息，如果为空，表示session已经过期
        Object obj = session.getAttribute(Const.SYSTEM_USER_SESSION);
        if (null == obj) {
            // 根据用户登录账号获取数据库中的用户信息
            Map<String ,Object> map=new HashMap<>();
            map.put("coname",cookie_username);
            User dbUser = (User) User_Server.listByMap(map);
            // 将用户保存到session中
            session.setAttribute(Const.SYSTEM_USER_SESSION, dbUser);
        }
        // 已经登录
        return true;
    }*/
}

