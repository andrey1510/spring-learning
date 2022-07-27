package entities;

import org.springframework.stereotype.Component;

@Component
public class Fox {

    private String name = "RedFox";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
