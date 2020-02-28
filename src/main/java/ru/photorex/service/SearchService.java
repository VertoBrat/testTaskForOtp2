package ru.photorex.service;

import ru.photorex.model.Phone;

import java.util.List;

public interface SearchService {

    List<Phone> searchPerLastNameAndFirstName(String lastName, String firstName);
}
