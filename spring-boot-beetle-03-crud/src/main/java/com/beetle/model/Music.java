package com.beetle.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Music {
    private String name;
    private String label;

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
