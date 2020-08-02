package com.bxrt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Description
 * @Author CHEN
 * @Date 2020/7/31 0031 11:29:40
 * @Version
 */

@SpringBootApplication
@MapperScan("com.bxrt.dao")
public class BxrtApplication {
    public static void main(String[] args) {
        SpringApplication.run(BxrtApplication.class, args);
    }
}
