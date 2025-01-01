package com.lnisking.handler;


import com.lnisking.enums.ResponseHttpCodeEnum;
import com.lnisking.exception.BaseException;
import com.lnisking.result.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 18:56:55
 * @version: v 0.1.24
 * @Description: 返回给前端的异常处理
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 处理异常
    @ExceptionHandler()
    public ResponseResult<?> exceptionHandler(BaseException e){
        // 打印异常信息
        log.error("出现了异常：{}",e.getMessage() );
        // 从异常对象中获取提示信息封账返回
        return ResponseResult.error(ResponseHttpCodeEnum.SYSTEM_ERROR);
    }
}
