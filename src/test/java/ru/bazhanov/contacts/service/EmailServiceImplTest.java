package ru.bazhanov.contacts.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.Email;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.model.Person;
import ru.bazhanov.contacts.repository.OrganizationRepository;
import ru.bazhanov.contacts.repository.PersonRepository;

@SpringBootTest
public class EmailServiceImplTest {
    @Autowired
    private EmailService emailService;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private OrganizationRepository organizationRepository;

    @BeforeEach
    public void init(){
        organizationRepository.save(new Organization("CompanyEmail", "CityEmail"));
        Organization organization = organizationRepository.findAll().get(0);
        personRepository.save(new Person("Ivanov", "Ivan", "Ivanovich", organization));
    }

    @Test
    public void test_that_save_is_Ok(){
        Person person = personRepository.findAll().get(0);
        Email newEmail = new Email(person, "ivanov@email.ru");
        int size = emailService.findAll().size();
        Assertions.assertTrue(emailService.saveEmail(newEmail));
        Assertions.assertEquals(size+1, emailService.findAll().size());
    }
    @Test
    public void test_that_save_is_false(){
        Person person = personRepository.findAll().get(0);
        Email newEmail = new Email();
        int size = emailService.findAll().size();
        Boolean save = emailService.saveEmail(newEmail);
        Assertions.assertFalse(save);
        Assertions.assertEquals(size, emailService.findAll().size());
    }
}
