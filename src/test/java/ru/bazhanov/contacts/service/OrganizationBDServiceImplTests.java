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
    public void test_that_save_is_ok(){
        OrganizationDTO orgDTO = new OrganizationDTO();
        orgDTO.setName("Company1");
        orgDTO.setCity("City1");
        int size = orgRepository.findAll().size();
        orgService.save(orgDTO);
        Assertions.assertEquals(size+1, orgRepository.findAll().size());
    }
}
