import entities.Bear;
import entities.Fox;
import entities.Wolf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("entities");

        Fox fox = context.getBean(Fox.class);
        Wolf wolf = (Wolf) context.getBean("wolf");
        Bear bear = context.getBean("bigbear", Bear.class);

        System.out.println(fox.getName());
        System.out.println(wolf.getName());
        System.out.println(bear.getName());
    }
}



