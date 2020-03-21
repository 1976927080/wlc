package com.wlc.gmall.user.service.impl;

import com.wlc.gmall.user.bean.UmsMember;
import com.wlc.gmall.user.dao.UserDao;
import com.wlc.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<UmsMember> getAllUser() {
        return userDao.getAllUser();
    }
}
