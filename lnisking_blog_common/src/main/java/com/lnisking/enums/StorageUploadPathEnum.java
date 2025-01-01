package com.lnisking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 14:07:01
 * @version: v 0.1.24
 * @Description: 上传到存储服务器的地址
 */

@Getter
@AllArgsConstructor
public enum StorageUploadPathEnum {
    // 这里的路径，前面不要带 / 后，后面需要带 /
    AVATAR("lnisking/avatar/", "用户头像存储地址"),
    COVER("lnisking/cover/", "文章封面存储地址"),
    IMAGE("lnisking/image/", "文章图片存储地址"),
    VIDEO("lnisking/video/", "文章视频存储地址"),
    PHOTO("lnisking/photo/", "收藏照片存储地址");

    // 存储路径
    private final String path;
    // 存储描述
    private final String desc;
}
