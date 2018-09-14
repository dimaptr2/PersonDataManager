package ru.iegs.services.person.watcher.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.iegs.services.person.watcher.controller.managers.PersonDataManager;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ServiceProcessor {

    private static final String TEMPLATE_TEXT = "%s";
    private final AtomicLong counter = new AtomicLong();
    private PersonDataManager personDataManager;

    @Autowired
    public ServiceProcessor(PersonDataManager personDataManager) {
        this.personDataManager = personDataManager;
    }

    @PostMapping("/person/store")
    public String storePersonEntity(
            @RequestParam(name = "first-name", defaultValue = "") String firstName,
            @RequestParam(name = "last-name", defaultValue = "") String lastName,
            @RequestParam(name = "middle-name", defaultValue = "") String middleName) {

        StringBuilder answer = new StringBuilder(0);

        if ((firstName == null || firstName.isEmpty())
        && (lastName == null || lastName.isEmpty())) {

        } else {
            answer.append("{\"Empty\": \"Не заданы обязательные параметры\"}");
        }

        return String.format(TEMPLATE_TEXT, answer.toString());
    }

}
