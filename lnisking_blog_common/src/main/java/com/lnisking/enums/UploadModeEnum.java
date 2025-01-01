package com.lnisking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 14:15:52
 * @version: v 0.1.24
 * @Description: 上传策略
 */

@AllArgsConstructor
@Getter
public enum UploadModeEnum {

    MINIO("minio", "MinioUploadStrategyImpl");


    private final String uploadMode;
    private final String uploadStrategy;

    /**
     * 根据上传模式获取上传策略
     * @param uploadMode 模式
     * @return 策略
     */
    public static String getUploadStrategy(String uploadMode) {
        for (UploadModeEnum value : UploadModeEnum.values()) {
            if (value.getUploadMode().equals(uploadMode)){
                return value.getUploadStrategy();
            }
        }
        return null;
    }
}
