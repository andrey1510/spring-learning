package com.jpabootsample2;

import com.jpabootsample2.repositories.ActorEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JpaBootSample2ApplicationTests {

    @Test
    public void contextLoads() {
    }

    //ActorEntityRepository actorEntityRepository
    @Test
    public void findByIdTest() {
       // assertEquals("Optional[ActorEntity{actorId=2, firstName='Nick', lastName='Wahlberg', lastUpdate=2013-05-26 14:47:57.62}])",
               //actorEntityRepository.findById(2));


    }




//            ActorEntity actor1 = new ActorEntity("New", "Actor", timestamp1);
//            System.out.println(actorEntityRepository.save(actor1));
//            System.out.println(actorEntityRepository.findById(2));
//            System.out.println(actorEntityRepository.count());
//            System.out.println(actorEntityRepository.findAll());
//            System.out.println(actorEntityRepository.findByFirstName("Zero"));
//            System.out.println(actorEntityRepository.selectActorByFirstNameAndOverMinimumId("John", 4));
//            System.out.println(actorEntityRepository.selectActorByFirstNameAndOverMinimumId2("John", 4));





}
