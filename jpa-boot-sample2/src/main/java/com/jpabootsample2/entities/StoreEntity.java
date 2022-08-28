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
@Entity
@Table(name = "store", schema = "public", catalog = "dvdrental")
public class StoreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "store_id", nullable = false)
    private Integer storeId;
    @Basic
    @Column(name = "manager_staff_id", nullable = false)
    private Short managerStaffId;
    @Basic
    @Column(name = "address_id", nullable = false)
    private Short addressId;
    @Basic
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;

    @OneToOne  // двусторонняя связь - inverse side
    private StaffEntity staff;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StoreEntity that = (StoreEntity) o;
        return storeId != null && Objects.equals(storeId, that.storeId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
