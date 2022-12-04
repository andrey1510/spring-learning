package com.jpabootsample2;

import com.jpabootsample2.entities.ActorEntity;
import com.jpabootsample2.repositories.ActorEntityRepository;
import com.jpabootsample2.repositories.CityEntityRepository;
import com.jpabootsample2.repositories.CountryEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class JpaBootSample2Application {

    private static Logger logger = LoggerFactory.getLogger(JpaBootSample2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(JpaBootSample2Application.class, args);
        logger.info("App started with Log4j2 configuration");
    }


    @Bean
    CommandLineRunner commandLineRunner(ActorEntityRepository actorEntityRepository,
                                        CityEntityRepository cityEntityRepository,
                                        CountryEntityRepository countryEntityRepository) {
        return args -> {

            String dateTime = "2016-05-26 14:47:57.620000";
            DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
            LocalDateTime localDateTime = LocalDateTime.from(formatDateTime.parse(dateTime));
            Timestamp timestamp1 = Timestamp.valueOf(localDateTime);

            //System.out.println(countryEntityRepository.findAll());
            System.out.println(actorEntityRepository.findById(2));
         };
    }


}
