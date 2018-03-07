package com.zx.app.service.impl;

import com.zx.app.dao.cluster.MemberDao;
import com.zx.app.dao.master.UserDao;
import com.zx.app.entity.Member;
import com.zx.app.entity.User;
import com.zx.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MemberDao memberDao;

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

    @Override
    public List<Member> queryMember() {
        return memberDao.queryMember();
    }
}
