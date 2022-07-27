package entities;

import org.springframework.stereotype.Component;

@Component
public class Wolf {

    private String name = "GreyWolf";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
