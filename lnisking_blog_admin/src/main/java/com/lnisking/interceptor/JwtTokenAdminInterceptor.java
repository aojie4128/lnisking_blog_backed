package com.lnisking.interceptor;


import com.alibaba.fastjson.JSONObject;
import com.lnisking.constant.JwtClaimConstant;
import com.lnisking.context.BaseContext;
import com.lnisking.entity.UserAuthor;
import com.lnisking.enums.ResponseHttpCodeEnum;
import com.lnisking.properties.JwtProperties;
import com.lnisking.result.ResponseResult;
import com.lnisking.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Author: lnisking
 * @createTime: 2025年01月01日 16:55:35
 * @version: v 0.1.24
 * @Description: 请求拦截器
 */

@Slf4j
@Component
@RequiredArgsConstructor
public class JwtTokenAdminInterceptor implements HandlerInterceptor {


    private final JwtProperties jwtProperties;

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler) throws Exception {
        //判断当前拦截到的是Controller的方法还是其他资源
        if (!(handler instanceof HandlerMethod)) {
            //当前拦截到的不是动态方法，直接放行
            return true;
        }
        // 设置返回字符集
        response.setContentType("text/html;charset=utf-8");

        // 1、获取拦截的url
        String requestUrl = request.getRequestURL().toString();
        log.info("请求的url为：{}",requestUrl);

        // 2、判断是不是登录行为，如果是，就放行
        if (requestUrl.contains("admin/login")) {
            return true;
        }

        // 如果不是登录行为，便是访问资源行为，验证是否登录了
        // 3、获取请求头中 token
        String token = request.getHeader(jwtProperties.getAdminTokenName());

        // 4、如果没有，则需要登录，返回给前端
        if (ObjectUtils.isEmpty(token)) {
            log.info("请求头中token为空，需要登录");
            ResponseResult<UserAuthor> notLogin = ResponseResult.error(ResponseHttpCodeEnum.NO_LOGIN);
            // 使用fastjson将对象转成json字符串
            String jsonString = JSONObject.toJSONString(notLogin);

            log.info("返回给前端的json字符串为：{}",jsonString);
            //将错误信息传给前端
            response.getWriter().write(jsonString);
            return false;
        }

        // 5、如果有token，验证token是否正确
        try {
            Claims claims = JwtUtil.parseToken(jwtProperties.getAdminSecretKey(),token);
            Integer userId = (Integer)claims.get(JwtClaimConstant.USER_ID);
            // 将用户id存放到 线程共享空间中
            BaseContext.setUserId(userId);
            log.info("当前员工id：{}", userId);
            //3、通过，放行
        } catch (Exception e) {
            log.error("token过期或无效.{}",e.getMessage());
            ResponseResult<UserAuthor> tokenError = ResponseResult.error(ResponseHttpCodeEnum.TOKEN_EXPIRED_OR_TOKEN_INVALID);
            String tokenErrorJson = JSONObject.toJSONString(tokenError);
            response.getWriter().print(tokenErrorJson);
            return false;
        }
        // 6、全部情况过后，放行，
        // 返回true表示放行
        return true;
    }
}

