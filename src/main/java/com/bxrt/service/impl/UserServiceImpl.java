package com.bxrt.service.impl;

import com.bxrt.dao.UserDao;
import com.bxrt.entity.User;
import com.bxrt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author CHEN
 * @Date 2020/8/2 0002 22:47:25
 * @Version
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User Login(String LoginAccount, String userPwd) {
        return userDao.Login(LoginAccount,userPwd);
    }
}
