package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:48:07
 * @version: v 0.1.24
 * @Description: 文章标签实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_article_tag", description = "文章标签实体")
public class ArticleTag {

    @Schema(description = "文章标签id")
    private Integer articleTagId;

    @Schema(description = "文章id")
    private Integer articleId;

    @Schema(description = "标签id")
    private Integer tagId;

}
