package ru.photorex.service;

import ru.photorex.model.Person;
import ru.photorex.model.Phone;
import ru.photorex.model.PhoneBook;

import java.util.Arrays;
import java.util.Collections;

public class PhoneBookServiceImpl implements PhoneBookService {

    private PhoneBook phoneBook;

    public PhoneBookServiceImpl() {
        phoneBook = new PhoneBook();
        initBookWithPersons();
    }

    @Override
    public boolean fillBook(Person person) {
        return phoneBook.addPerson(person);
    }

    @Override
    public PhoneBook getBook() {
        return phoneBook;
    }

    private void initBookWithPersons() {
        Phone phone1 = new Phone("+8 800 2000 500");
        Phone phone2 = new Phone("+8 800 2000 600");
        Phone phone3 = new Phone("+8 800 2000 300");
        Phone phone4 = new Phone("+8 800 4000 500");
        Person ivanov = new Person("Иван", "Иванов", Arrays.asList(phone1, phone2));
        Person sidorov = new Person("Сергей", "Сидоров", Collections.singletonList(phone3));
        Person petrov = new Person("Петя", "Петров", Collections.singletonList(phone4));
        phoneBook.addPersons(ivanov, sidorov, petrov);
    }
}
