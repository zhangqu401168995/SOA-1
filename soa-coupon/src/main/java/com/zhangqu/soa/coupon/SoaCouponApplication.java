package com.zhangqu.soa.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SoaCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoaCouponApplication.class, args);
    }

}
