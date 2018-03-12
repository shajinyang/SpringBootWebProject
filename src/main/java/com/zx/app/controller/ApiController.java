package com.zx.app.controller;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.zx.app.entity.FreeOrder;
import com.zx.app.entity.FreeOrderGroup;
import com.zx.app.entity.Member;
import com.zx.app.entity.User;
import com.zx.app.handler.TokenHandler;
import com.zx.app.http.response.ResponseBean;
import com.zx.app.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 获取活动列表
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public ResponseBean<FreeOrder> queryUser(@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum){
        ResponseBean responseBean=new ResponseBean<FreeOrder>();
        List<FreeOrder> users=userService.queryUser();

        /*String redisValue = stringRedisTemplate.opsForValue().get("a");
        if (StringUtils.isEmpty(redisValue)) {
            stringRedisTemplate.opsForValue().set("a","hehe");
        }
        String res= stringRedisTemplate.opsForValue().get("a");
        responseBean.setInfo(res+"");*/

        responseBean.setData(users);
        return responseBean;
    }

    /**
     * 参加活动
     * @return
     */
    @RequestMapping(value = "/joinActivity",method = RequestMethod.POST )
    public ResponseBean joinActivity(@RequestBody FreeOrderGroup freeOrderGroup){
        ResponseBean responseBean=new ResponseBean();
        Integer id= userService.insertOrderGroup(freeOrderGroup);
        responseBean.setInfo("您已成功参加活动，订单ID为:"+id) ;
        return  responseBean;
    }

}
