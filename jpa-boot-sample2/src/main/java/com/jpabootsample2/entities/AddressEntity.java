package com.jpabootsample2.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "address", schema = "public", catalog = "dvdrental")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id", nullable = false)
    private Integer addressId;
    @Basic
    @Column(name = "address", nullable = false, length = 50)
    private String address;
    @Basic
    @Column(name = "address2", nullable = true, length = 50)
    private String address2;
    @Basic
    @Column(name = "district", nullable = false, length = 20)
    private String district;
    @Basic
    @Column(name = "city_id", nullable = false)
    private Short cityId;
    @Basic
    @Column(name = "postal_code", nullable = true, length = 10)
    private String postalCode;
    @Basic
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;
    @Basic
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AddressEntity that = (AddressEntity) o;
        return addressId != null && Objects.equals(addressId, that.addressId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
