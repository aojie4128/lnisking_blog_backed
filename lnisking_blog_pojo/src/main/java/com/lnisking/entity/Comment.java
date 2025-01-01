package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:49:32
 * @version: v 0.1.24
 * @Description: 评论实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_comment", description = "评论实体")
public class Comment {

    @Schema(description = "评论id")
    private Integer commentId;

    @Schema(description = "发布评论的用户id ")
    private Integer userId;

    @Schema(description = "被评论内容id")
    private Integer topicId;

    @Schema(description = "评论内容")
    private String commentContent;

    @Schema(description = "被评论用户id")
    private Integer replyUserId;

    @Schema(description = "被评论评论id")
    private Integer parentCommentId;

    @Schema(description = "评论类型 1.文章 2.留言 3.关于我 4.友链 5.说说")
    private Integer commentType;

    @Schema(description = "是否删除 0 否 1 是")
    private Integer isDelete;

    @Schema(description = "是否审核  0否 1 是")
    private Integer isApproved;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
