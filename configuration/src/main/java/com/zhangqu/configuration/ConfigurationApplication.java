package com.zhangqu.configuration;

import com.zhangqu.configuration.controller.SaveImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


@EnableDiscoveryClient
@SpringBootApplication
public class ConfigurationApplication {

    public static void main(String[] args) {


        SpringApplication.run(ConfigurationApplication.class, args);
        while(true) {
            //当动态配置刷新时，会更新到 Enviroment中，因此这里每隔一秒中从Enviroment中获取配置
            String id = applicationContext.getEnvironment().getProperty("Configuretion.id");
            String name = applicationContext.getEnvironment().getProperty("Configuretion.name");
            System.err.println("ID:" + id + "; name: " + name);
            TimeUnit.SECONDS.sleep(1);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入1更改configuration的值：");
        int n = scanner.nextInt();
        if(n == 1){
            SaveImpl save = new SaveImpl();
            save.save();
        }



    }



}
