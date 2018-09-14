package ru.iegs.services.person.watcher.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.iegs.services.person.watcher.controller.managers.PersonDataManager;

@RestController
public class ServiceProcessor {

    private PersonDataManager personDataManager;

    @Autowired
    public ServiceProcessor(PersonDataManager personDataManager) {
        this.personDataManager = personDataManager;
    }

}
