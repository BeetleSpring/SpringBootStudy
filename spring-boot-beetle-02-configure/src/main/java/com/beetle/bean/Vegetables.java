package com.beetle.bean;

public class Vegetables {
    private String potato;
    private String eggplant;
    private String greenPepper;

    public Vegetables() {
    }

    public Vegetables(String potato, String eggplant, String greenPepper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenPepper = greenPepper;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenPepper() {
        return greenPepper;
    }

    public void setGreenPepper(String greenPepper) {
        this.greenPepper = greenPepper;
    }
}
