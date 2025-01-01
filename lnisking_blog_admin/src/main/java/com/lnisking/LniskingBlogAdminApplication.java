package com.lnisking;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: lnisking
 * @createTime: 2024年12月31日 20:47:48
 * @version: v 0.1.24
 * @Description: admin启动类
 */

@Slf4j
@SpringBootApplication
public class LniskingBlogAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(LniskingBlogAdminApplication.class, args);
        log.info("admin启动成功");
    }
}

