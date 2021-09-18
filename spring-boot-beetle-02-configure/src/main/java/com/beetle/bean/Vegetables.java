package com.beetle.bean;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Vegetables {
    private String potato;
    private String eggplant;
    private String greenPepper;
    private String[] seasoning;

    public Vegetables() {
    }

    public Vegetables(String potato, String eggplant, String greenPepper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenPepper = greenPepper;
    }


}
