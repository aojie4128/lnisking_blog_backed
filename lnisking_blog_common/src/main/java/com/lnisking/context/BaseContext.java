package com.lnisking.context;


/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 13:40:02
 * @version: v 0.1.24
 * @Description: 处理同个线程共享数据
 */

public class BaseContext {
    // 私有构造函数,防止被实例化
    private BaseContext(){}

    private static final ThreadLocal<Integer> THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 设置用户id
     * @param userId 用户id
     */
    public static void setUserId(Integer userId) {
        THREAD_LOCAL.set(userId);
    }

    /**
     * 获取用户id
     * @return 用户id
     */
    public static Integer getUserId() {
        return THREAD_LOCAL.get();
    }

    /**
     * 清除数据
     */
    public static void remove() {
        THREAD_LOCAL.remove();
    }
}

