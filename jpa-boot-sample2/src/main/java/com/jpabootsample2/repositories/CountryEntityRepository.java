package com.jpabootsample2.repositories;

import com.jpabootsample2.entities.ActorEntity;
import com.jpabootsample2.entities.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface CountryEntityRepository extends JpaRepository<CountryEntity, Integer> {


}