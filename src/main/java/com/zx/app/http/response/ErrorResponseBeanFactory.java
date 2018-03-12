package com.zx.app.http.response;


public class ErrorResponseBeanFactory implements IResponseBeanFactory {

    public static final int ERROR_TOKEN_CODE=1001;
    public static final int NO_LOGIN_CODE=1002;
    public static final int ERROR_SIGN_CODE=1003;

    public static final String ERROR_TOKEN_INFO="token无效";
    public static final String NO_LOGIN_INFO="未登录";
    public static final String ERROR_SIGN_INFO="签名错误";


    @Override
    public ResponseBean createResponseBean(int code) {
        ResponseBean<String> responseBean=new ResponseBean();
        responseBean.setError(code);
        switch (code){
            case ERROR_TOKEN_CODE:
                responseBean.setInfo(ERROR_TOKEN_INFO);
                break;
            case NO_LOGIN_CODE:
                responseBean.setInfo(NO_LOGIN_INFO);
                break;
            case ERROR_SIGN_CODE:
                responseBean.setInfo(ERROR_SIGN_INFO);
                break;
        }
        responseBean.setData("");
        return responseBean;
    }
}
