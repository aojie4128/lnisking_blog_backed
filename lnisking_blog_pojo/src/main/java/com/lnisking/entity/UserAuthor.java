package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:53:45
 * @version: v 0.1.24
 * @Description: 用户权限实体
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_user_author", description = "用户权限实体")
public class UserAuthor {

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "登录类型 1 邮箱 2 手机号")
    private Integer loginType;

    @Schema(description = "用户登录ip")
    private String ipAddress;

    @Schema(description = "ip来源")
    private String ipRegion;

    @Schema(description = "是否禁用 0 否 1 是")
    private Integer isDisable;

    @Schema(description = "上次登录时间")
    private java.util.Date lastLoginTime;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
