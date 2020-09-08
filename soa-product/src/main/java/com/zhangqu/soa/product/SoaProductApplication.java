package com.zhangqu.soa.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SoaProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoaProductApplication.class, args);
    }

}
