package ru.photorex.service;

import ru.photorex.model.Person;
import ru.photorex.model.PhoneBook;

public interface PhoneBookService {

    boolean fillBook(Person person);

    PhoneBook getBook();
}
