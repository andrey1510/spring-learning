package com.jpabootsample2.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name = "country", schema = "public", catalog = "dvdrental")
public class CountryEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id", nullable = false)
    Integer countryId;

    @Basic
    @Column(name = "country", nullable = false, length = 50)
    String country;

    @Basic
    @Column(name = "last_update", nullable = false)
    Timestamp lastUpdate;

    @OneToMany (mappedBy = "countryEntity")  // двусторонняя связь - owning side
//    @JoinColumn(name = "country_id")
    List<CityEntity> cities;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        if (!countryId.equals(that.countryId)) return false;
        if (!country.equals(that.country)) return false;
        if (!lastUpdate.equals(that.lastUpdate)) return false;
        return cities.equals(that.cities);
    }

    @Override
    public int hashCode() {
        int result = countryId.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + lastUpdate.hashCode();
        result = 31 * result + cities.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "countryId = " + countryId + ", " +
                "country = " + country + ", " +
                "lastUpdate = " + lastUpdate + ")";
    }
}
