package com.lnisking.result;


import com.lnisking.enums.ResponseHttpCodeEnum;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:41:36
 * @version: v 0.1.24
 * @Description: 同意结果响应类
 */

@Data
public class ResponseResult<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    // 标志 忘记为什么了设置这个，后面再改
    private boolean flag;
    // 状态码
    private Integer code;
    // 消息
    private String message;
    // 数据
    private T data;

    public static <T> ResponseResult<T> success(ResponseHttpCodeEnum codeEnum, T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setFlag(true);
        responseResult.setCode(codeEnum.getResponseCode());
        responseResult.setMessage(codeEnum.getResponseMessage());
        responseResult.setData(data);
        return responseResult;
    }

    public static <T> ResponseResult<T> success(ResponseHttpCodeEnum codeEnum) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setFlag(true);
        responseResult.setCode(codeEnum.getResponseCode());
        responseResult.setMessage(codeEnum.getResponseMessage());
        return responseResult;
    }

    public static <T> ResponseResult<T> error() {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setFlag(false);
        return responseResult;
    }

    public static <T> ResponseResult<T> error(ResponseHttpCodeEnum codeEnum) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setFlag(false);
        responseResult.setCode(codeEnum.getResponseCode());
        responseResult.setMessage(codeEnum.getResponseMessage());
        return responseResult;
    }
}
