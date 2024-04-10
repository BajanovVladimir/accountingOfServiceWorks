package ru.bazhanov.contacts.service;

import ru.bazhanov.contacts.model.PhoneNumber;

import java.util.List;

public interface PhoneNumberService {
    List<PhoneNumber> findAll();
    Boolean savePhoneNumber(PhoneNumber phoneNumber);
}
