package com.lnisking.properties;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:32:23
 * @version: v 0.1.24
 * @Description: 上传或搜索策略
 */
@Data
@Component
public class StrategyProperties {
    // 上传策略
    @Value("${strategy.upload.mode}")
    private String uploadMode;
    // 搜索策略
    @Value("${strategy.search.mode}")
    private String searchMode;
}
