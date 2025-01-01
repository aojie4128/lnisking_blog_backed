package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:48:55
 * @version: v 0.1.24
 * @Description: 分类实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_category", description = "分类实体")
public class Category {

    @Schema(description = "分类id")
    private Integer categoryId;

    @Schema(description = "分类名")
    private String categoryName;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
