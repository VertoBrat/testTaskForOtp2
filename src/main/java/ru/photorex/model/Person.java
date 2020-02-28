package ru.photorex.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private List<Phone> phones = new ArrayList<>();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }
}
