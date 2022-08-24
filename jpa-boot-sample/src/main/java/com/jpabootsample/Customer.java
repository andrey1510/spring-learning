package com.jpabootsample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {

    @Id                 // annotated with @Id so that JPA recognizes it as the object’s ID
    @GeneratedValue(strategy = GenerationType.AUTO) // to indicate that the ID should be generated automatically.
    private Long id;

    private String firstName;   // will be mapped to column that share the same name

    private String lastName;  // will be mapped to column that share the same name

    protected Customer() {}   // default constructor is not used it directly, so it may be "protected".

    public Customer(String firstName, String lastName) {      // constructor will create instances of Singer to be saved to the database.
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
}
