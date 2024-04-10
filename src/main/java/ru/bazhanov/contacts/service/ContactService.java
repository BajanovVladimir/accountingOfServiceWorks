package ru.bazhanov.contacts.service;


import ru.bazhanov.contacts.dto.ContactDTO;
import ru.bazhanov.contacts.model.Person;

import java.util.List;

public interface ContactService {
   Boolean saveContact(ContactDTO contactDTO);
   List<Person> findAll();
}
