package sample.jpatemplate.repository;

import org.springframework.data.repository.CrudRepository;
import sample.jpatemplate.models.Person;

import java.util.List;

public interface PersonRepository<P> extends CrudRepository<Person, Long> {
    List<Person> findByFirstName(String firstName);
}
