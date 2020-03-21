package com.wlc.gmall.user.service;

import com.wlc.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UmsMember> getAllUser();
}
