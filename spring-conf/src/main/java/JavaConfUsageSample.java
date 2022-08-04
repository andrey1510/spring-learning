import configs.MyJavaFileConfig;
import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfUsageSample {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyJavaFileConfig.class); //or "configs"  (i.e package)   );
        // интерфейс ApplicationContext применяется в Spring для сохранения всей информации о среде, относящейся к приложению, которым управляет Spring
        // создание экземпляра (context) класса AnnotationConfigApplicationContext, реализующего интерфейс ApplicationContext
        // context будет искать классы отмеченные аннотац. @Configuration в указанных пакетах ("configs") или классах, классы и пакеты можно указывать через запятую

        // variant 1 - указание класса (можно интерфейс) нужного объекта
        Cat cat = context.getBean(Cat.class);
        // getBean () читает конфигурацию приложения, инициализирует среду интерфейса ApplicationContext, затем возвращает экземпляр сконфигурированного компонента Spring Bean
        // variant 2 - указание класса (в тайпкасте), указание имени ("dog") (т.к. когда Spring будет создавать объект класса Dog, он назовет его именем класса с прописной буквы)
        Dog dog = (Dog) context.getBean("dog");
        // variant 3 - указание класса и имени (для точности имя нужно указать в файле конфигурации)
        Parrot parrot = context.getBean("some_parrot", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());


    }

}
