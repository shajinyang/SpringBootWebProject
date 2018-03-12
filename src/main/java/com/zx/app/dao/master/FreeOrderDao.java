package com.zx.app.dao.master;

import com.zx.app.entity.FreeOrder;
import com.zx.app.entity.FreeOrderGroup;
import com.zx.app.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface FreeOrderDao {
    List<FreeOrder> queryFreeOrderList();

    Integer insertOrderGroup(FreeOrderGroup freeOrderGroup);
}
