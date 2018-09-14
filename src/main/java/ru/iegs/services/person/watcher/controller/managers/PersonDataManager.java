package ru.iegs.services.person.watcher.controller.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.iegs.services.person.watcher.model.entity.Person;
import ru.iegs.services.person.watcher.model.repository.Personable;

import java.util.List;
import java.util.Optional;

/**
 * Data Manager that can do CRUD activities for the "Person" entity.
 */
@Service
public class PersonDataManager {

    private Personable personable;

    @Autowired
    public PersonDataManager(Personable personable) {
        this.personable = personable;
    }

    // Create and update activity

    public void savePerson(Person person) {
        personable.save(person);
    }

    public void deletePerson(Person person) {
        personable.delete(person);
    }

    public void deleteAllPersons() {
        personable.deleteAll();
    }

    // Read activity

    public Optional<Person> readPersonById(int id) {
        return personable.findById(id);
    }

    public boolean isExistPerson(Person person) {
        if (personable.findById(person.getId()).isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    public List<Person> readPersonsByFirstNameAndLastName(String firstName, String lastName) {
        return personable.findPersonByFirstNameAndLastName(firstName, lastName);
    }

    public List<Person> readPersonsByFirstNameLike(String template) {
        return personable.findPersonByFirstNameLike(template);
    }

    public List<Person> readPersonsByLastNameLike(String template) {
        return personable.findPersonByLastNameLike(template);
    }

    public List<Person> readAllPersons() {
        return (List<Person>) personable.findAll();
    }

}
