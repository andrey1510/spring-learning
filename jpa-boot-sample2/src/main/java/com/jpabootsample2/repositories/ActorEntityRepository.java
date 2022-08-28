package com.jpabootsample2.repositories;

import com.jpabootsample2.entities.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface ActorEntityRepository extends JpaRepository<ActorEntity, Integer> {

    List<ActorEntity> findByFirstName(String firstName);

    @Query("SELECT a FROM ActorEntity a WHERE a.firstName = ?1 AND a.actorId > ?2")
    List<ActorEntity> selectActorByFirstNameAndOverMinimumId(
            String firstName, Integer actorId);

    @Query(value = "SELECT * FROM actor WHERE first_name = :firstName AND actor_id > :actorId", nativeQuery = true)
    List<ActorEntity> selectActorByFirstNameAndOverMinimumId2(
            @Param("firstName") String firstName,
            @Param("actorId") Integer actorId);


}