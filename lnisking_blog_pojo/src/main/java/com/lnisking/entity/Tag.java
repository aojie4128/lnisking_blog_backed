package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:52:37
 * @version: v 0.1.24
 * @Description: 标签实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_tag", description = "标签实体")
public class Tag {

    @Schema(description = "标签id")
    private Integer tagId;

    @Schema(description = "标签名")
    private String tagName;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
