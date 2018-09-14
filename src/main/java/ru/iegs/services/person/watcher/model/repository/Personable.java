package ru.iegs.services.person.watcher.model.repository;

import org.springframework.data.repository.CrudRepository;
import ru.iegs.services.person.watcher.model.entity.Person;

import java.util.List;

public interface Personable extends CrudRepository<Person, Integer> {
    List<Person> findPersonByFirstNameAndLastName(String firstName, String lastName);
    List<Person> findPersonByFirstNameLike(String pattern);
    List<Person> findPersonByLastNameLike(String pattern);
}
