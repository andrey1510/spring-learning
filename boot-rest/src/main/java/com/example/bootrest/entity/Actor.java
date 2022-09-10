package com.example.bootrest.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "actor2")
public class Actor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "actor_id", nullable = false)
    private Integer actorId;

    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

//    @Basic
//    @Column(name = "last_update", nullable = false)
//    private Timestamp lastUpdate;

    @Override
    public String toString() {
        return "ActorEntity{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                // ", lastUpdate=" + lastUpdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Actor actor = (Actor) o;
        return actorId != null && Objects.equals(actorId, actor.actorId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
