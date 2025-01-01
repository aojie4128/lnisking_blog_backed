package com.lnisking.exception;


import com.lnisking.enums.ResponseHttpCodeEnum;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 14:55:25
 * @version: v 0.1.24
 * @Description: 基础异常，在控制台或日志输出
 */

public class BaseException extends RuntimeException {

    // 无参构造方法
    public BaseException() {
    }

    // 有参构造方法
    public BaseException(ResponseHttpCodeEnum codeEnum){
        super(codeEnum.getResponseMessage());
    }
}
