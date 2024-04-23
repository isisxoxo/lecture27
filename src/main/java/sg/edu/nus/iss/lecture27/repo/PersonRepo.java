package sg.edu.nus.iss.lecture27.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.lecture27.model.Person;

@Repository
public class PersonRepo {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Person insertPerson(Person person) {
        Person insertedPerson = mongoTemplate.insert(person);
        return insertedPerson;
    }

    /* Alternative */
    // public Person savePerson(Person person) {
    // Person savedPerson = mongoTemplate.save(person);
    // return savedPerson;
    // }

    public List<Person> findAll() {
        return mongoTemplate.findAll(Person.class);
    }
}
