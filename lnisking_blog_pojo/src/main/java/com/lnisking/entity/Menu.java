package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:50:58
 * @version: v 0.1.24
 * @Description: 后台菜单实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_menu", description = "后台菜单实体")
public class Menu {

    @Schema(description = "菜单id")
    private Integer menuId;

    @Schema(description = "菜单名")
    private String name;

    @Schema(description = "菜单路径")
    private String path;

    @Schema(description = "菜单组件")
    private String component;

    @Schema(description = "菜单图标")
    private String icon;

    @Schema(description = "父菜单id")
    private Integer menuParentId;

    @Schema(description = "重定向路径")
    private String redirect;

    @Schema(description = "排序顺序")
    private Integer orderNum;

    @Schema(description = "是否隐藏 0 隐藏 1 显示")
    private Integer hidden;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
