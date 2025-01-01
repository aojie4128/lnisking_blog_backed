package com.lnisking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 13:42:41
 * @version: v 0.1.24
 * @Description: 处理响应返回数据
 */

@Getter
@AllArgsConstructor
public enum ResponseHttpCodeEnum {

    // ----------- 成功状态码 -----------
    SUCCESS(200, "操作成功"),

    // ----------- 通用状态码 -----------
    SYSTEM_ERROR(5000, "出错啦，后台小哥正在努力修复中"),
    MINIO_UPLOAD_ERROR(5010, "系统错误，上传失败"),

    // ---------- 业务状态吗 ---------
    NO_LOGIN(4000, "用户未登录"),

    UNAUTHORIZED(4010, "无访问权限，请先登录"),

    USERNAME_OR_PWD_ERROR(4020, "用户名或密码错误"),

    ACCOUNT_LOCKED(4030, "账户被锁定"),

    TOKEN_EXPIRED_OR_TOKEN_INVALID(4040, "身份过期，请重新登录"),

    // ----------- 后台状态码 -----------
    CATEGORY_NOT_EMPTY(4050, "分类不能为空"),

    ADD_CATEGORY_ERROR(4060, "添加分类失败"),

    TAG_NOT_EMPTY(4070, "标签不能为空"),

    ADD_TAG_ERROR(4080, "添加标签失败"),

    IS_DUPLICATE_ERROR(4090, "已存在,请重试"),


    PARAM_ERROR(5200, "参数错误"),


    FAIL(5100, "操作失败"),

//    TOKEN_EXPIRED(5101, "Token 已过期"),


    AGENT_REGION_SEARCH_ERROR(5110, "访客IP归属地查询失败"),
    ;

    // 响应码
    private final Integer responseCode;
    // 响应信息
    private final String responseMessage;
}
