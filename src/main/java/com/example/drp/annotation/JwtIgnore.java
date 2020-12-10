package com.example.drp.annotation;

import java.lang.annotation.*;

/**
 * ========================
 * JWT验证忽略注解
 * Created with IntelliJ IDEA.
 * @Author LT
 * @create 2020-12-4 11:17
 * Version: v1.0
 * ========================
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JwtIgnore {
}
