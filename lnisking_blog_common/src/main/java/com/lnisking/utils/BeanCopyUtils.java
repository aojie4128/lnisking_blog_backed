package com.lnisking.utils;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 16:11:25
 * @version: v 0.1.24
 * @Description: 实体拷贝，属性赋值
 */

@Slf4j
public class BeanCopyUtils {

    private BeanCopyUtils(){}


    /**
     *  单个bean实现属性值拷贝
     * @param source 复制来源
     * @param clazz 复制类
     * @param <T> 类型
     * @return bean
     */
    public static <T> T copyBean(Object source,Class<T> clazz) {
        T result = null;
        try {
            result = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            log.info("copy失败：{}",e.getMessage());
        }
        return result;
    }

    /**
     *  集合bean实现属性值拷贝
     * @param list 来源
     * @param clazz 复制
     * @param <T>> 类型
     * @param <V> 类型
     * @return beans
     */
    public static <T,V> List<V> copyBeanList(List<T> list , Class<V> clazz){
        return list.stream().map( item ->{
            V result = null;
            try {
                result = clazz.getDeclaredConstructor().newInstance();
                BeanUtils.copyProperties(item, result);
            } catch (Exception e) {
                log.info("copy列表失败：{}",e.getMessage());
            }
            return result;
        }).toList();
    }
}

