package com.beetle.configure;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties该注解是 声明这是一个配置文件的类
// 里面prefix指的是从 application.properties文件中获取的值的 一级名称

@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfigure {
    private String prefix;
    private String name;




}
