package wiredEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Snake {

    private String name = "defaultSnakeName";

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public String getName() {
        return name;
    }

}


