package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:44:45
 * @version: v 0.1.24
 * @Description: 文章实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_article", description = "文章实体")
public class Article {

    @Schema(description = "文章id")
    private Integer articleId;

    @Schema(description = "文章作者")
    private Integer userId;

    @Schema(description = "文章分类")
    private Integer categoryId;

    @Schema(description = "文章缩略图")
    private String articleCover;

    @Schema(description = "文章标题")
    private String articleTitle;

    @Schema(description = "文章摘要，如果该字段为空，默认取文章前240字符")
    private String articleAbstract;

    @Schema(description = "文章内容")
    private String articleContent;

    @Schema(description = "文章状态  1 公开 2 私密 3 草稿 ")
    private Integer articleStatus;

    @Schema(description = "文章类型 1 原创 2 转载 3 翻译")
    private Integer articleType;

    @Schema(description = "观看次数")
    private Integer viewCount;

    @Schema(description = "是否置顶  0 否 1 是")
    private Integer isTop;

    @Schema(description = "是否推荐  0 否 1 是")
    private Integer isRecommend;

    @Schema(description = "是否删除  0 否 1 是")
    private Integer isDelete;

    @Schema(description = "是否审核通过  0 否 1 是")
    private Integer isApproved;

    @Schema(description = "是否支持评论 0 否 1 是")
    private Integer isComment;

    @Schema(description = "原文链接")
    private String originalUrl;

    @Schema(description = "发表时间")
    private java.util.Date createTime;

    @Schema(description = "更新时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
