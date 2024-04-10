package ru.bazhanov.contacts.service;

import ru.bazhanov.contacts.model.Email;
import ru.bazhanov.contacts.model.Person;

import java.util.List;

public interface EmailService {
    List<Email> findAll();
    Boolean saveEmail(Email newEmail);
}

