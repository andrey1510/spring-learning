package constrEntities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Porcupine {

    private String name = "defaultPorcupineName";

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public String getName() {
        return name;
    }

}


