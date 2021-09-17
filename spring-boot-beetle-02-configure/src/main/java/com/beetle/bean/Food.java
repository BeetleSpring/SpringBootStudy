package com.beetle.bean;

public class Food {
    private String prefix;
    private String name;

    public Food(String name, String prefix) {
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
