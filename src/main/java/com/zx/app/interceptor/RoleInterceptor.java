package com.zx.app.interceptor;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.zx.app.handler.ResponseHandler;
import com.zx.app.handler.TokenHandler;
import com.zx.app.http.response.ErrorResponseBeanFactory;
import com.zx.app.http.response.IResponseBeanFactory;
import com.zx.app.http.response.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 访问权限控制
 */
@Component
public class RoleInterceptor implements HandlerInterceptor {

    @Autowired
    private TokenHandler tokenHandler;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
       /* String toekn= request.getParameter("token");
        if(tokenHandler.isValid(toekn)){
            return true;
        }else {
            ResponseHandler.printAuthMsg(response);
            return false;
        }*/
       return true;
    }

}
