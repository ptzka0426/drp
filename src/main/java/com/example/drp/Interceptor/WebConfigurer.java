package com.example.drp.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LT
 * @create 2020-11-24 18:46
 */
/*@Configuration*/
public class WebConfigurer implements WebMvcConfigurer {

   /* @Autowired
    private LoginInterceptor loginHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration ir = registry.addInterceptor(loginHandlerInterceptor);
        // 拦截路径
        ir.addPathPatterns("/*");
        // 不拦截路径
        List<String> irs = new ArrayList<String>();
        irs.add("/api/*");
        irs.add("/wechat/*");
        irs.add("/oauth");
        ir.excludePathPatterns(irs);
    }*/
}
