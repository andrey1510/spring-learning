package entities;

import org.springframework.stereotype.Component;

@Component ("bigbear")
public class Bear {

    private String name = "WhiteBear";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
