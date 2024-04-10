package ru.bazhanov.contacts.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.model.Person;
import ru.bazhanov.contacts.model.PhoneNumber;
import ru.bazhanov.contacts.repository.OrganizationRepository;
import ru.bazhanov.contacts.repository.PersonRepository;

@SpringBootTest
public class PhoneNumberServiceImplTest {
    @Autowired
    OrganizationRepository organizationRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PhoneNumberService phoneNumberService;

    @BeforeEach
    public void init(){
        organizationRepository.save(new Organization("CompanyPhone", "CityPhone"));
        Organization organization = organizationRepository.findAll().get(0);
        personRepository.save(new Person("Ivanova", "Svetlana", "Pavlovna", organization));
    }
    @Test
    public void test_that_save_is_ok(){
        Person person = personRepository.findAll().get(0);
        PhoneNumber newPhoneNumber = new PhoneNumber(person,"+79875674532");
        int size = phoneNumberService.findAll().size();
        Assertions.assertTrue(phoneNumberService.savePhoneNumber(newPhoneNumber));
        Assertions.assertEquals(size+1,phoneNumberService.findAll().size());
    }

    @Test
    public void test_that_save_is_false(){
        Person person = personRepository.findAll().get(0);
        PhoneNumber newPhoneNumber = new PhoneNumber();
        int size = phoneNumberService.findAll().size();
        Assertions.assertFalse(phoneNumberService.savePhoneNumber(newPhoneNumber));
        Assertions.assertEquals(size,phoneNumberService.findAll().size());
    }
}
