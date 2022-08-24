package com.jpabootsample2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class JpaBootSample2Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaBootSample2Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ActorEntityRepository actorEntityRepository) {
        return args -> {

            String dateTime = "2016-05-26 14:47:57.620000";
            DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
            LocalDateTime localDateTime = LocalDateTime.from(formatDateTime.parse(dateTime));
            Timestamp timestamp1 = Timestamp.valueOf(localDateTime);



//            ActorEntity actor1 = new ActorEntity("L", "N", timestamp1);
//            System.out.println(actorEntityRepository.save(actor1));
//            System.out.println(actorEntityRepository.findById(2));
//            System.out.println(actorEntityRepository.count());
//            System.out.println(actorEntityRepository.findAll());
//            System.out.println(actorEntityRepository.findByFirstName("Zero"));
//            System.out.println(actorEntityRepository.selectActorByFirstNameAndOverMinimumId("John", 4));
//            System.out.println(actorEntityRepository.selectActorByFirstNameAndOverMinimumId2("John", 4));

         };
    }


}
