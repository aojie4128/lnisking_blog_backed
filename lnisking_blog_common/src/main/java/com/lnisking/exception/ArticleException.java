package com.lnisking.exception;


import com.lnisking.enums.ResponseHttpCodeEnum;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 15:08:00
 * @version: v 0.1.24
 * @Description: 文章相关异常
 */

public class ArticleException extends BaseException {
    public ArticleException(ResponseHttpCodeEnum codeEnum) {
        super(codeEnum);
    }
}
