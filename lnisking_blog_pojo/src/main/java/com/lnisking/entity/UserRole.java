package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:56:26
 * @version: v 0.1.24
 * @Description: 用户角色实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_user_role", description = "用户角色实体")
public class UserRole {

    @Schema(description = "用户角色id")
    private Integer userRoleId;

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "角色名称")
    private String roleName;

    @Schema(description = "是否禁用 0 否 1 是")
    private Integer isDisable;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
