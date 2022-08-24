// https://spring.io/guides/gs/accessing-data-jpa/

package com.jpabootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // includes @Configuration, @EnableAutoConfiguration, @ComponentScan
public class JpaBootSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaBootSampleApplication.class, args);
    }

}
