package com.jpabootsample2.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "staff", schema = "public", catalog = "dvdrental")
public class StaffEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "staff_id", nullable = false)
    private Integer staffId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "address_id", nullable = false)
    private Short addressId;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "store_id", nullable = false)
    private Short storeId;
    @Basic
    @Column(name = "active", nullable = false)
    private Boolean active;
    @Basic
    @Column(name = "username", nullable = false, length = 16)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 40)
    private String password;
    @Basic
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;
    @Basic
    @Column(name = "picture", nullable = true)
    private byte[] picture;

    @OneToOne (mappedBy = "staff")  // двусторонняя связь - owning side
    private StoreEntity store;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StaffEntity that = (StaffEntity) o;
        return staffId != null && Objects.equals(staffId, that.staffId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
