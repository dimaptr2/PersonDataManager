package ru.iegs.services.person.watcher.controller.formatters;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class DateAndTimeFormatter {

    public String convertIsoDateToRussianFormattedString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(date);
    }

}
