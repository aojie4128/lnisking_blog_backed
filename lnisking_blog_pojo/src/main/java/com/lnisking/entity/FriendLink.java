package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 09:50:13
 * @version: v 0.1.24
 * @Description: 友链实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_friend_link", description = "友链实体")
public class FriendLink {

    @Schema(description = "友链id")
    private Integer linkId;

    @Schema(description = "友链名称")
    private String linkName;

    @Schema(description = "友链头像")
    private String linkAvatar;

    @Schema(description = "友链地址")
    private String linkAddress;

    @Schema(description = "友链介绍")
    private String linkProfile;

    @Schema(description = "创建时间")
    private java.util.Date createTime;

    @Schema(description = "修改时间")
    private java.util.Date updateTime;

    @Schema(description = "创建人")
    private Integer createUser;

    @Schema(description = "修改人")
    private Integer updateUser;

}
