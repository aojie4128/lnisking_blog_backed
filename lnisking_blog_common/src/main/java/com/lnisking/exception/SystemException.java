package com.lnisking.exception;


import com.lnisking.enums.ResponseHttpCodeEnum;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:06:58
 * @version: v 0.1.24
 * @Description: 系统相关异常
 */

public class SystemException extends BaseException {
    public SystemException(ResponseHttpCodeEnum codeEnum) {
        super(codeEnum);
    }
}
