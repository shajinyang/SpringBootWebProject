package com.zx.app.service;

import com.zx.app.entity.Member;
import com.zx.app.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> queryUser();

    List<Member> queryMember();
}
