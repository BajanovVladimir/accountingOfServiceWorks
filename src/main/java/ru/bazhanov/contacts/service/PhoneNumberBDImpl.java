package ru.bazhanov.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ru.bazhanov.contacts.model.PhoneNumber;
import ru.bazhanov.contacts.repository.PhoneNumberRepository;

import java.util.List;

@Service
public class PhoneNumberBDImpl implements PhoneNumberService{
    @Autowired
    PhoneNumberRepository phoneNumberRepository;

    @Override
    public List<PhoneNumber> findAll() {
        return phoneNumberRepository.findAll();
    }

    @Override
    public Boolean savePhoneNumber(PhoneNumber phoneNumber) {
        try{
            phoneNumberRepository.save(phoneNumber);
            return true;
        }catch (DataIntegrityViolationException | NullPointerException e){
            return false;
        }
    }
}
