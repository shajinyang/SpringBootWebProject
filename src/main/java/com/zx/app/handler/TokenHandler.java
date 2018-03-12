package com.zx.app.handler;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Token处理类
 */
@Service
public class TokenHandler {

    @Value("${token.key}")
    private String key;
    @Value("${token.exp}")
    private long expSpace;
    /**
     * 验证token是否合法
     */
    public boolean isValid(String tokenString){
        if(tokenString==null){
            return false;
        }
        String exp=desCode(tokenString);
        if(exp.isEmpty()){
            return false;
        }
        if(Long.parseLong(exp)<System.currentTimeMillis()/1000L){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 生成Token
     * @return
     */
    public String geneToken(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("exp",System.currentTimeMillis()/1000L+expSpace);
        return Jwts.builder()
                .setSubject("appToken")
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
    }


    /**
     * 解码token
     * @param token
     * @return
     */
    private  String desCode(String token){
        String exp;
        try {
            exp= Jwts.parser()
                    .setSigningKey(key)
                    .parseClaimsJws(token)
                    .getBody()
                    .get("exp")+"";
        } catch (Exception e) {
            return "";
        }
        return "null".equals(exp)?"":exp;
    }
}
