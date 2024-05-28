package ru.bazhanov.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bazhanov.contacts.dto.ContactDTO;
import ru.bazhanov.contacts.model.Email;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.model.Person;
import ru.bazhanov.contacts.model.PhoneNumber;
import ru.bazhanov.contacts.repository.PersonRepository;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
   private final OrganizationService organizationService;
   private final PersonRepository personRepository;
   private final PhoneNumberService phoneNumberService;
   private final EmailService emailService;

    @Autowired
    public ContactServiceImpl(OrganizationService organizationService, PersonRepository personRepository, PhoneNumberService phoneNumberService, EmailService emailService) {
        this.organizationService = organizationService;
        this.personRepository = personRepository;
        this.phoneNumberService = phoneNumberService;
        this.emailService = emailService;
    }

    @Override
    public Boolean saveContact(ContactDTO contactDTO) {
        Organization organization = organizationService.findById(contactDTO.getOrganizationID());
        Person findPerson = personRepository.findByLastNameAndFirstNameAndPatronymicAndOrganization(contactDTO.getLastName(), contactDTO.getFirstName(), contactDTO.getPatronymic(), organization);
        if( findPerson == null) {
            Person person = new Person(contactDTO.getLastName(), contactDTO.getFirstName(), contactDTO.getPatronymic(), organization);
            personRepository.save(person);
            if(phoneNumberService.savePhoneNumber(new PhoneNumber(person, contactDTO.getPhone()))){
                return emailService.saveEmail(new Email(person, contactDTO.getEmail()));
            }
        }
        return false;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
