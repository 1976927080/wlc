package com.wlc.gmall.user.controller;

import com.wlc.gmall.user.bean.UmsMember;
import com.wlc.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public  List<UmsMember> getAllUser() {
        List<UmsMember> umsMember=userService.getAllUser();
        return umsMember;
    }
}
