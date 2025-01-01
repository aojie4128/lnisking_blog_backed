package com.lnisking;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: lnisking
 * @createTime: 2024年12月31日 21:25:13
 * @version: v 0.1.24
 * @Description: web启动类
 */

@Slf4j
@SpringBootApplication
public class LniskingBlogWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(LniskingBlogWebApplication.class, args);
        log.info("web启动成功");
    }
}
