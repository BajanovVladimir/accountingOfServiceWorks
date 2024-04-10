package ru.bazhanov.contacts.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.contacts.dto.ContactDTO;
import ru.bazhanov.contacts.dto.OrganizationDTO;

import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.repository.OrganizationRepository;

import java.util.List;


@SpringBootTest
public class ContactServiceImplTests {
    @Autowired
    private ContactService contactService;
    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private OrganizationRepository organizationRepository;


    @BeforeEach
    public void init(){
        OrganizationDTO org1 = new OrganizationDTO();
        org1.setName("CompanyContact1");
        org1.setCity("CityContact1");
        OrganizationDTO org2 = new OrganizationDTO();
        org2.setName("CompanyContact2");
        org2.setCity("CityContact2");
        organizationService.save(org1);
        organizationService.save(org2);
    }

    @Test
    public void test_that_save_is_true(){
        List<Organization> orgList = organizationService.findAll();
        int orgId = orgList.get(0).getId();
        ContactDTO newContactDTO = new ContactDTO(orgId,"Ivanov","Ivan","Ivanovich","+79867546372","ivanov@email.ru");
        int size = contactService.findAll().size();
        Assertions.assertTrue(contactService.saveContact(newContactDTO));
        Assertions.assertEquals(size+1,contactService.findAll().size());
    }
    @Test
    public void test_that_save_is_false_when_such_contact_exists(){
        List<Organization> orgList = organizationService.findAll();
        int orgId = orgList.get(0).getId();
        ContactDTO contactDTO = new ContactDTO(orgId,"Petrov","Ivan","Ivanovich","+79867546372","ivanov@email.ru");
        ContactDTO newContactDTO = new ContactDTO(orgId,"Petrov","Ivan","Ivanovich","+79867546372","ivanov@email.ru");
        contactService.saveContact(contactDTO);
        int size = contactService.findAll().size();
        Assertions.assertFalse(contactService.saveContact(newContactDTO));
        Assertions.assertEquals(size,contactService.findAll().size());
    }
    @Test
    public void test_that_save_is_false_when_such_contact_(){
        List<Organization> orgList = organizationService.findAll();
        int orgId = orgList.get(0).getId();
        ContactDTO contactDTO = new ContactDTO(orgId,"Petrov","Ivan","Ivanovich","+79867546372","ivanov@email.ru");
        ContactDTO newContactDTO = new ContactDTO(orgId,"Petrov","Ivan","Ivanovich","+79867546372","ivanov@email.ru");
        contactService.saveContact(contactDTO);
        int size = contactService.findAll().size();
        Assertions.assertFalse(contactService.saveContact(newContactDTO));
        Assertions.assertEquals(size,contactService.findAll().size());
    }
}
