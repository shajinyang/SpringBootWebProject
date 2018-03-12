package com.zx.app.handler;

import com.alibaba.fastjson.JSON;
import com.zx.app.http.response.ErrorResponseBeanFactory;
import com.zx.app.http.response.ResponseBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * response处理类
 */
public class ResponseHandler {

    public static void printAuthMsg(HttpServletResponse response){
        StringBuilder sb = new StringBuilder();
        response.setCharacterEncoding("utf-8");
        ResponseBean responseBean=new ErrorResponseBeanFactory().createResponseBean(ErrorResponseBeanFactory.ERROR_TOKEN_CODE);
        String res= JSON.toJSONString(responseBean);
        sb.append(res);
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(sb.toString());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
