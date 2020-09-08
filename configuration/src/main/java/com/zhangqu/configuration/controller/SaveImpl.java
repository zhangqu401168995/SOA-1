package com.zhangqu.configuration.controller;

import com.zhangqu.configuration.entity.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/setConfig")
public class SaveImpl implements SaveConfigurationController{

    @Autowired
    private Configuration configuration;
    @RequestMapping("/save")
    @Override
    public Configuration save() {
        configuration.setId("70");
        configuration.setName("zhangsan");

        return configuration;
    }
}
