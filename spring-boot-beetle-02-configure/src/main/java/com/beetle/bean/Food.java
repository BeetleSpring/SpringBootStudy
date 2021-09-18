package com.beetle.bean;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Food {
    private String prefix;
    private String name;

    public Food(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
    }


}
