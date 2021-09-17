package com.beetle;

import com.beetle.configure.FoodConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication  // 相当于使用 @Configuration @EnableAutoConfiguration @ComponentScan
@EnableConfigurationProperties({FoodConfigure.class})//当工程中有配置类的时候 需要这个注解告诉程序是哪些 配置类（类上带有@ConfigurationProperties）
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
