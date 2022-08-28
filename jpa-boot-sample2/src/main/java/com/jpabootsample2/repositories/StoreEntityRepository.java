package com.jpabootsample2.repositories;

import com.jpabootsample2.entities.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StoreEntityRepository extends JpaRepository<StoreEntity, Integer>  {
}