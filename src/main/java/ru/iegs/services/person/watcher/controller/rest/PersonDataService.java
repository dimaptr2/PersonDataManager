package ru.iegs.services.person.watcher.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.iegs.services.person.watcher.controller.managers.PersonDataManager;

@RestController
public class PersonDataService {

    private PersonDataManager personDataManager;

    @Autowired
    public PersonDataService(PersonDataManager personDataManager) {
        this.personDataManager = personDataManager;
    }

}
