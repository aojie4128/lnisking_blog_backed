package com.lnisking.exception;

import com.lnisking.enums.ResponseHttpCodeEnum;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:06:25
 * @version: v 0.1.24
 * @Description: 用户相关异常
 */

public class UserException extends BaseException {
    public UserException(ResponseHttpCodeEnum codeEnum) {
        super(codeEnum);
    }
}
