package com.lnisking.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @Author: lnisking
 * @createTime: 2024年1月1日 10:05:40
 * @version: v 0.1.24
 * @Description: 用户角色实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "lnisking_visit_statistics", description = "null")
public class VisitStatistics {
    
    @Schema(description = "访问id")
    private Integer id;

    @Schema(description = "访问ip")
    private String ip;

    @Schema(description = "访问时间")
    private java.util.Date visitTime;

    @Schema(description = "访问设备")
    private String userAgent;

    @Schema(description = "访问页面")
    private String pageUrl;

}
