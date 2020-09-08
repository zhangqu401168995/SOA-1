package com.zhangqu.soa.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SoaWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoaWareApplication.class, args);
    }


}
