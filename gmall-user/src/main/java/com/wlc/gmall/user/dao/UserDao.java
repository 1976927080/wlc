package com.wlc.gmall.user.dao;

import com.wlc.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    @Select("select * from ums_member")
    List<UmsMember> getAllUser();


}
