package com.zx.app.dao.master;

import com.zx.app.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {
    List<User> queryUser();
}
