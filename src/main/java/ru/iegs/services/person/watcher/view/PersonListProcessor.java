package ru.iegs.services.person.watcher.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.iegs.services.person.watcher.controller.formatters.DateAndTimeFormatter;

import java.time.LocalDate;

@Controller
public class PersonListProcessor {

    private DateAndTimeFormatter dateAndTimeFormatter;

    @Autowired
    public PersonListProcessor(DateAndTimeFormatter dateAndTimeFormatter) {
        this.dateAndTimeFormatter = dateAndTimeFormatter;
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute(
                "current-date",
                dateAndTimeFormatter.convertIsoDateToRussianFormattedString(LocalDate.now())
        );
        return "index";
    }

}
