package com.beetle.controller;

import com.beetle.bean.Food;
import com.beetle.bean.Vegetables;
import com.beetle.configure.FoodConfigure;
import com.beetle.configure.VegetablesConfigure;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private VegetablesConfigure vegetablesConfigure;
    @RequestMapping("/json")
    public Vegetables json(){

        //Food food = new Food(foodConfigure.getName(),foodConfigure.getPrefix());
        Vegetables vegetables = new Vegetables(vegetablesConfigure.getPotato(),vegetablesConfigure.getEggplant(),vegetablesConfigure.getGreenPepper());
        return vegetables;
    }
}
