package com.jpabootsample2.repositories;

import com.jpabootsample2.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Integer> {
}