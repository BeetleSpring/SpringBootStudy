package com.beetle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;


@Data@AllArgsConstructor @NoArgsConstructor
public class Music implements Serializable {
    //private static final long serialVersionUID =1L;
    private Long id;

    private String name;

    private String label;

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}

