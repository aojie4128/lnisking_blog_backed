package com.lnisking.exception;


import com.lnisking.enums.ResponseHttpCodeEnum;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:09:06
 * @version: v 0.1.24
 * @Description: 菜单相关异常
 */

public class MenuException extends BaseException {
    public MenuException(ResponseHttpCodeEnum codeEnum) {
        super(codeEnum);
    }
}
