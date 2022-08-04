package configs;

import entities.Parrot;
import entities.Cat;
import entities.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaFileConfig {

    @Bean // context вызовет методы, помеченные аннотацией @Bean     // равнозначно разметке <bean id="getCat" class="entities.Cat"/>
    public Cat getCat() {
        return new Cat();
    }

    @Bean ("some_parrot")
    public Parrot getParrot() {
        return new Parrot();
    }

    @Bean ("dog")
    public Dog getDog() {
        return new Dog();
    }

}
