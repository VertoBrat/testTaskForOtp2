package ru.photorex.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class PhoneBook {

    private List<Person> persons = new ArrayList<>();

    public boolean addPerson(Person person) {
        return persons.add(person);
    }

    public boolean addPersons(Person ... people) {
        return persons.addAll(Arrays.asList(people));
    }
}
