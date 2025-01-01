package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:53:13
 * @version: v 0.1.24
 * @Description: 说说实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_talk", description = "说说实体")
public class Talk {

    @Schema(description = "说说id")
    private Integer talkId;

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "说说内容")
    private String talkContent;

    @Schema(description = "说说图片")
    private String talkCover;

    @Schema(description = "说说状态 0 私密 1 公开")
    private Integer talkStatus;

    @Schema(description = "是否置顶 0 否 1 是")
    private Integer isTop;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
