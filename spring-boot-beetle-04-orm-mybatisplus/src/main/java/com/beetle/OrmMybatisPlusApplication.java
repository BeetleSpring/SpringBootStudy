package com.beetle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan({"com.beetle.dao"})这个是正常mybatis需要扫描的包
@MapperScan("com.beetle.dao")
public class OrmMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmMybatisPlusApplication.class, args);
	}

}
