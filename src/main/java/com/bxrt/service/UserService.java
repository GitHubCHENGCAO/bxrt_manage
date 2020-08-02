package com.bxrt.service;

import com.bxrt.entity.User;

public interface UserService {
    /**
     * 用户登录
     * @param loginAccount
     * @param userPwd
     * @return
     */
    User Login(String loginAccount, String userPwd);
}
