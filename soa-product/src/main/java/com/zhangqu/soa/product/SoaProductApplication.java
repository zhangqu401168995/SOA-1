package com.zhangqu.soa.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.zhangqu.soa.product.dao")
@SpringBootApplication
public class SoaProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoaProductApplication.class, args);
    }

}
