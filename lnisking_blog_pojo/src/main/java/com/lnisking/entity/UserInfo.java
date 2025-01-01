package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:54:38
 * @version: v 0.1.24
 * @Description: 用户信息实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_user_info", description = "用户信息实体")
public class UserInfo {

    @Schema(description = "用户信息id")
    private Integer userInfoId;

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "用户邮箱")
    private String userEmail;

    @Schema(description = "用户昵称")
    private String userNickname;

    @Schema(description = "用户头像")
    private String userAvatar;

    @Schema(description = "用户性别 0 女 1 男")
    private Integer userGender;

    @Schema(description = "用户号码")
    private String userPhone;

    @Schema(description = "用户生日")
    private java.util.Date userBirthday;

    @Schema(description = "用户简介")
    private String userProfile;

    @Schema(description = "用户网站")
    private String userWebsite;

    @Schema(description = "是否订阅 0 否 1 是")
    private Integer isSubscribe;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
