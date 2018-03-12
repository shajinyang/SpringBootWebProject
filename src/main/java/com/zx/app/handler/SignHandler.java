package com.zx.app.handler;

import com.zx.app.handler.util.MD5;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

/**
 * 签名处理类
 */
@Service
public class SignHandler {

    @Value("${sign.key}")
    private String signKey;

    //对参数进行签名排序
    public String genAppSign(Map<String,Object> params) {
        StringBuilder sb = new StringBuilder();
        // 根据键名排序，取值进行签名生成
        Object[] key_arr = params.keySet().toArray();
        Arrays.sort(key_arr);
        for  (Object key : key_arr) {
            if(params.get(key)==null){
                sb.append("");
            }else {
                String value = params.get(key).toString();
                sb.append(value);
            }
        }
        sb.append(signKey);
        String appSign = MD5.getMessageDigest(sb.toString().getBytes());
        return appSign;
    }

}
