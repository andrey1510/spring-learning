import configs.MyConstructorConfig;
import configs.MyWiredConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wiredEntities.Snake;

public class JavaConstructorConfUsageSample {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConstructorConfig.class); //or "configs"  (i.e package)   );

        Snake snake = context.getBean(Snake.class);

        System.out.println(snake.getName());
        snake.setName("Mr. Huggy");
        System.out.println(snake.getName());

    }

}
