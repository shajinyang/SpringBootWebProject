package com.zx.app.dao.cluster;

import com.zx.app.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface MemberDao {
    List<Member> queryMember();
}
