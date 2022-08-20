//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import sample.jpatemplate.model.Singer;
//
//import java.util.List;
//
//@Service
//public class PersonService {
//
//    @Autowired
//    PersonRepository<Singer> personRepository;
//
//    @Transactional
//    public List<Singer> getAllPersons() {
//        return (List<Singer>) personRepository.findAll();
//    }
//
//    @Transactional
//    public List<Singer> findByName(String name) {
//        return personRepository.findByFirstName(name);
//    }
//
////    @Transactional
////    public sample.jpatemplate.models.Person getById(Long id) {
////        return personRepository.findById(id);
////    }
////
////    @Transactional
////    public void deletePerson(Long personId) {
////        personRepository.delete(personId);
////    }
//
//    @Transactional
//    public boolean addPerson(Singer person) {
//        return personRepository.save(person) != null;
//    }
//
//    @Transactional
//    public boolean updatePerson(Singer person) {
//        return personRepository.save(person) != null;
//    }
//
//}
