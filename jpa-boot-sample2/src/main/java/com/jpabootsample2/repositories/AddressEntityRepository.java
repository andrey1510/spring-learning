package com.jpabootsample2.repositories;

import com.jpabootsample2.entities.AddressEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface AddressEntityRepository extends JpaRepository<AddressEntity, Integer> {

    @Query("select count(distinct a) from AddressEntity a where a.addressId between ?1 and ?2")
    long fff(@NonNull Integer addressIdStart, @NonNull Integer addressIdEnd);

    @Query("select count(a) from AddressEntity a where a.postalCode like concat('%', ?1, '%')")
    long countByPostalCodeContains(@Nullable String postalCode);
}