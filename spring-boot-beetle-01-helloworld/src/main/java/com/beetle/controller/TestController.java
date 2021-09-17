package com.beetle.controller;


import com.beetle.DemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  //相当于 @controller+@ResponseBody 返回json形式的结果 而不是视图
public class TestController {


    @RequestMapping("/")
    public String testHelloworld(){
        return "hello world";
    }

    @RequestMapping("/greeting")
    public String greeting(String name){
        if(name==null)
            name="World";
        return "hello"+name;
    }


}
