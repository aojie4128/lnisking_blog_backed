package com.lnisking.config;


import com.lnisking.interceptor.JwtTokenAdminInterceptor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 16:34:17
 * @version: v 0.1.24
 * @Description: web配置，拦截器等
 */

@Slf4j
@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    private final JwtTokenAdminInterceptor jwtTokenAdminInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("拦截器注册成功");
        registry.addInterceptor(jwtTokenAdminInterceptor)
                .addPathPatterns("/admin/**") // 拦截所有请求路径
                .excludePathPatterns("/admin/login")// 放行登录接口
                .excludePathPatterns("/admin/logout");// 放行退出接口
    }
}
