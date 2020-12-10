package com.example.drp.Entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author LT
 * @create 2020-12-04 9:10
 */

@Data
@ConfigurationProperties(prefix = "audience")
@Component
public class Audience {

    private String clientId;
    private String base64Secret;
    private String name;
    private int expiresSecond;
}


