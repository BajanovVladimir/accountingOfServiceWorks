package ru.bazhanov.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ru.bazhanov.contacts.model.Email;
import ru.bazhanov.contacts.model.Person;
import ru.bazhanov.contacts.repository.EmailRepository;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class EmailServiceBDImpl implements EmailService{
    @Autowired
    EmailRepository emailRepository;

    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }

    @Override
    public Boolean saveEmail(Email newEmail) {
        try{
            emailRepository.save(newEmail);
            return true;
        } catch(DataIntegrityViolationException | NullPointerException e){
            return false;
        }
    }
}
