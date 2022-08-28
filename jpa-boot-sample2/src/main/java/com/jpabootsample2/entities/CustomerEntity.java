package com.jpabootsample2.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "customer", schema = "public", catalog = "dvdrental")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;
    @Basic
    @Column(name = "store_id", nullable = false)
    private Short storeId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "address_id", nullable = false)
    private Short addressId;
    @Basic
    @Column(name = "activebool", nullable = false)
    private Boolean activebool;
    @Basic
    @Column(name = "create_date", nullable = false)
    private Date createDate;
    @Basic
    @Column(name = "last_update", nullable = true)
    private Timestamp lastUpdate;
    @Basic
    @Column(name = "active", nullable = true)
    private Integer active;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CustomerEntity that = (CustomerEntity) o;
        return customerId != null && Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
