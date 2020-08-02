package com.bxrt.controller;

import com.bxrt.entity.User;
import com.bxrt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author CHEN
 * @Date 2020/8/2 0002 22:52:49
 * @Version
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String  login(){
        User user = userService.Login("chen","sa123");
        System.out.println(user);
        if(user!=null){
            return "登录成功！";
        }
        return "登录失败！";
    }
}
