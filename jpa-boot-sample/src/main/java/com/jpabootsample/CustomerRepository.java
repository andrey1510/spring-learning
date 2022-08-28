package com.jpabootsample;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
// By extending CrudRepository, CustomerRepository inherits several methods for working with Customer persistence,
// including methods for saving, deleting, and finding Customer entities.

// Spring Data JPA also lets you define other query methods by declaring their method signature.
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}

//  Implementation of interface is not required. Spring Data JPA creates an implementation when you run the application.