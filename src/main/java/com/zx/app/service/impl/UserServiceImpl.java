package com.zx.app.service.impl;

import com.zx.app.dao.cluster.MemberDao;
import com.zx.app.dao.master.FreeOrderDao;
import com.zx.app.entity.FreeOrder;
import com.zx.app.entity.FreeOrderGroup;
import com.zx.app.entity.Member;
import com.zx.app.entity.User;
import com.zx.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FreeOrderDao userDao;

    @Autowired
    private MemberDao memberDao;

    @Override
    public List<FreeOrder> queryUser() {
        return userDao.queryFreeOrderList();
    }

    @Override
    public List<Member> queryMember() {
        return memberDao.queryMember();
    }

    @Override
    public Integer insertOrderGroup(FreeOrderGroup freeOrderGroup) {

        return userDao.insertOrderGroup(freeOrderGroup);
    }

}
