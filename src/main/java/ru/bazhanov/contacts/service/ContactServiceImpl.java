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

    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PhoneNumberService phoneNumberService;
    @Autowired
    private EmailService emailService;

    @Override
    public Boolean saveContact(ContactDTO contactDTO) {
        Organization organization = organizationService.findById(contactDTO.getOrganizationID());
        if(personRepository.findByLastNameAndFirstNameAndPatronymicAndOrganization(contactDTO.getLastName(), contactDTO.getFirstName(), contactDTO.getPatronymic(), organization) == null) {
            Person person = personRepository.save(new Person(contactDTO.getLastName(), contactDTO.getFirstName(), contactDTO.getPatronymic(), organization));
            phoneNumberService.savePhoneNumber(new PhoneNumber(person, contactDTO.getPhone()));
            emailService.saveEmail(new Email(person, contactDTO.getEmail()));
            return true;
        }
        return false;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
