package com.zhangqu.configuration.controller;

import com.zhangqu.configuration.entity.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@RequestMapping("/getConfig")
public class GetImpl implements GetConfigurationController{


    @Autowired
    private Configuration configuration;

//    @Value("${config.id}")
//    private String id;

    @RequestMapping("/get")
    @Override
    public String get(){
        return id;
    }
}
