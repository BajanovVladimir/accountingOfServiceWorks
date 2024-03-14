package ru.bazhanov.contacts.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.contacts.dto.OrganizationDTO;
import ru.bazhanov.contacts.model.repository.OrganizationRepository;


@SpringBootTest
public class OrganizationBDServiceImplTests {

    @Autowired
    OrganizationService orgService;
    @Autowired
    OrganizationRepository orgRepository;

    @Test
    public void test_that_save_is_true(){
        OrganizationDTO orgDTO = new OrganizationDTO();
        orgDTO.setName("Company1");
        orgDTO.setCity("City1");
        int size = orgRepository.findAll().size();
        Assertions.assertTrue( orgService.save(orgDTO));
        Assertions.assertEquals(size+1, orgRepository.findAll().size());
    }

    @Test
    public void test_that_save_is_false(){
        OrganizationDTO orgDTO = new OrganizationDTO();
        int size = orgRepository.findAll().size();
        Assertions.assertFalse(orgService.save(orgDTO));
        Assertions.assertEquals(size, orgRepository.findAll().size());
    }

    @Test
    public void test_that_save_is_true_when_saving_an_existing_company_without_saving_it_reverently(){
        OrganizationDTO orgDTO = new OrganizationDTO();
        orgDTO.setCity("City2");
        orgDTO.setName("Company2");
        orgService.save(orgDTO);
        int size = orgRepository.findAll().size();
        OrganizationDTO orgDTONext = new OrganizationDTO();
        orgDTONext.setCity("City2");
        orgDTONext.setName("Company2");
        Assertions.assertTrue(orgService.save(orgDTONext));
        Assertions.assertEquals(size, orgRepository.findAll().size());
    }
}
