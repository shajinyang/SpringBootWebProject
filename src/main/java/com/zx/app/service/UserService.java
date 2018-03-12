package com.zx.app.service;

import com.zx.app.entity.FreeOrder;
import com.zx.app.entity.FreeOrderGroup;
import com.zx.app.entity.Member;
import com.zx.app.entity.User;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

public interface UserService {

    List<FreeOrder> queryUser();

    List<Member> queryMember();

    Integer insertOrderGroup(FreeOrderGroup freeOrderGroup);


}
