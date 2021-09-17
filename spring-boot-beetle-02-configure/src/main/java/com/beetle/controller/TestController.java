package com.beetle.controller;

import com.beetle.bean.Food;
import com.beetle.configure.FoodConfigure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FoodConfigure foodConfigure;
//    @Value("${food.name}")
//    private String name;
//    @Value("${food.prefix}")
//    private String prefix;

    @RequestMapping("/json")
    public Food json(){

        Food food = new Food(foodConfigure.getName(),foodConfigure.getPrefix());

        return food;
    }
}
