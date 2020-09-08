package com.zhangqu.configuration.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Configuration {
    private String id ;

    private String name;

    private List<String> list;

    private Map<Integer, String> map;

    public String getId() {
        id = "10";
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        name = "zhangqu";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
