package com.jpabootsample2.repositories;

import com.jpabootsample2.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface CityEntityRepository extends JpaRepository<CityEntity, Integer> {
}