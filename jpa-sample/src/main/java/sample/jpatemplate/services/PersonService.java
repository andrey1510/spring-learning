package sample.jpatemplate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sample.jpatemplate.models.Person;
import sample.jpatemplate.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository<Person> personRepository;

    @Transactional
    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @Transactional
    public List<Person> findByName(String name) {
        return personRepository.findByFirstName(name);
    }

//    @Transactional
//    public Person getById(Long id) {
//        return personRepository.findById(id);
//    }
//
//    @Transactional
//    public void deletePerson(Long personId) {
//        personRepository.delete(personId);
//    }

    @Transactional
    public boolean addPerson(Person person) {
        return personRepository.save(person) != null;
    }

    @Transactional
    public boolean updatePerson(Person person) {
        return personRepository.save(person) != null;
    }

}
