package ru.photorex.service;

import ru.photorex.model.Person;
import ru.photorex.model.Phone;
import ru.photorex.model.PhoneBook;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SearchServiceImpl implements SearchService {

    private final PhoneBookService phoneBookService;

    public SearchServiceImpl(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @Override
    public List<Phone> searchPerLastNameAndFirstName(String lastName, String firstName) {
        PhoneBook phoneBook = phoneBookService.getBook();
        Optional<List<Phone>> optionalPhones = phoneBook.getPersons().stream()
                .filter(p -> p.getFirstName().equals(firstName) && p.getLastName().equals(lastName))
                .map(Person::getPhones).findFirst();
        return optionalPhones.orElse(Collections.emptyList());
    }
}
