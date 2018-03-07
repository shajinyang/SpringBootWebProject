package com.zx.app.controller;

import com.zx.app.entity.Member;
import com.zx.app.entity.User;
import com.zx.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public Map<String,Object> queryUser(){
        Map<String,Object> map=new HashMap<>();
        List<User> list=userService.queryUser();
        List<Member> list1=userService.queryMember();
        map.put("error","0");
        map.put("message","success");
        map.put("data",list);
        map.put("data_cluster",list1);
        return map;
    }

}
