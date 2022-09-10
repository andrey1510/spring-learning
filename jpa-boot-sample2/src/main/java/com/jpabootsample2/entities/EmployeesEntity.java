package com.jpabootsample2.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "employees", schema = "public", catalog = "dvdrental")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "mobile_phone", nullable = true, length = 20)
    private String mobilePhone;
    @Basic
    @Column(name = "work_phone", nullable = true, length = 20)
    private String workPhone;
    @Basic
    @Column(name = "extension", nullable = true, length = 5)
    private String extension;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeesEntity that = (EmployeesEntity) o;
        return employeeId != null && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
