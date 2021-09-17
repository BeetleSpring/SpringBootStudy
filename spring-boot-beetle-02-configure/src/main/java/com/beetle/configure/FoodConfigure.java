package com.beetle.configure;


import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties该注解是 声明这是一个配置文件的类
// 里面prefix指的是从 application.properties文件中获取的值的 一级名称

@ConfigurationProperties(prefix = "food")
public class FoodConfigure {
    private String prefix;
    private String name;

    public FoodConfigure() {
    }

    public FoodConfigure(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
