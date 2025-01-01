package com.lnisking.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:16:22
 * @version: v 0.1.24
 * @Description: jwt配置填充
 */

@Data
@Component
@ConfigurationProperties(prefix = "blog.jwt")
public class JwtProperties {
    // 用户签名秘钥
    private String adminSecretKey;
    // 用户过期时间
    private long adminTtl;
    // 用户token名称
    private String adminTokenName;
}
