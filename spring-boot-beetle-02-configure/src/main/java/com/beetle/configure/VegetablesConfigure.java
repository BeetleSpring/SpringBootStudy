package com.beetle.configure;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter@Setter
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:application.yml")
public class VegetablesConfigure {
    private String potato;
    private String eggplant;
    private String greenPepper;
    private String[] seasoning;

    public VegetablesConfigure(String potato, String eggplant, String greenPepper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenPepper = greenPepper;
    }

    public VegetablesConfigure() {
    }

}
