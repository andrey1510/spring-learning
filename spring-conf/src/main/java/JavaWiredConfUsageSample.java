import configs.MyJavaFileConfig;
import configs.MyWiredConfig;
import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wiredEntities.Snake;

public class JavaWiredConfUsageSample {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyWiredConfig.class); //or "configs"  (i.e package)   );

        Snake snake = context.getBean(Snake.class);

        System.out.println(snake.getName());
        snake.setName("Mr. Huggy");
        System.out.println(snake.getName());

    }

}
