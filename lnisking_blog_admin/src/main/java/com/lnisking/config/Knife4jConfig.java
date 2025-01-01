package com.lnisking.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: lnisking
 * @createTime: 2024年12月31日 22:36:17
 * @version: v 0.1.24
 * @Description: knife4j接口文档配置
 */

@Slf4j
@Configuration
public class Knife4jConfig {
    @Bean
    public OpenAPI BlogOpenAPI() {
        log.info("OpenAPI配置成功");
        return new OpenAPI()
                .info(new Info().title("杰桀博客后台管理系统")
                        .description("杰桀博客后台管理系统API文档")
                        .version("1.0")
                        .contact(new Contact().name("杰桀").url("https:www.lnisking.com"))
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")));
    }
}
