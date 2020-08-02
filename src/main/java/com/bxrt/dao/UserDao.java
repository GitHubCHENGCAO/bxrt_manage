package com.bxrt.dao;

import com.bxrt.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao  {
    /**
     * 用户登录
     * @param loginAccount
     * @param userPwd
     * @return
     */
    User Login(@Param("loginAccount") String loginAccount,@Param("userPwd")  String userPwd);
}
