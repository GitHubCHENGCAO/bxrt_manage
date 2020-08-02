package com.bxrt.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description
 * @Author CHEN
 * @Date 2020/7/31 0031 11:34:21
 * @Version
 */
@Data
@Getter
@Setter
@ToString
public class User {
    private int uId;
    private String userName;    //真实姓名
    private String loginAccount; //登录账户
    private String userPwd;    //密码

}
