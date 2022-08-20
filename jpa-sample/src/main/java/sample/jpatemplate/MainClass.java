package sample.jpatemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.jpatemplate.config.ConfigFile;
import sample.jpatemplate.model.Singer;
import sample.jpatemplate.services.ServiceInt;


public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        ServiceInt service =  context.getBean(ServiceInt.class);
        Singer singer1 = new Singer();
        singer1.setFirstName("Some");
        singer1.setLastName("Singer");
        service.addSinger(singer1);

    }
}
