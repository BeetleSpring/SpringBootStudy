package com.beetle.configure;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfigure {
    private String potato;
    private String eggplant;
    private String greenPepper;

    public VegetablesConfigure(String potato, String eggplant, String greenPepper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenPepper = greenPepper;
    }

    public VegetablesConfigure() {
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
