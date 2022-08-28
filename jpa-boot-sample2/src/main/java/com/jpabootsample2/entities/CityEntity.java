package com.jpabootsample2.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "city", schema = "public", catalog = "dvdrental")
public class CityEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "city_id", nullable = false)
    Integer cityId;

    @Basic
    @Column(name = "city", nullable = false, length = 50)
    String city;

    @Basic
    @Column(name = "country_id", nullable = false)
    Short countryId;

    @Basic
    @Column(name = "last_update", nullable = false)
    Timestamp lastUpdate;

    @ManyToOne   // двусторонняя связь - inverse side
 //   @JoinColumn(name="country_id", nullable=false)
    private CountryEntity countryEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CityEntity that = (CityEntity) o;
        return cityId != null && Objects.equals(cityId, that.cityId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }



}
