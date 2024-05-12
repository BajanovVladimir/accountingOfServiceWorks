package ru.bazhanov.equipments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.service.ComponentTypeService;

@SpringBootTest
public class ComponentTypeBDServiceImplTests {
    @Autowired
    private ComponentTypeService componentTypeService;

    @Test
    public void test_that_save_is_true(){
        ComponentTypeDTO newComponentTypeDTO = new ComponentTypeDTO();
        newComponentTypeDTO.setName("newComponent");
        int size = componentTypeService.findAll().size();
        Assertions.assertTrue(componentTypeService.saveComponentType(newComponentTypeDTO));
        Assertions.assertEquals(size+1,componentTypeService.findAll().size());
    }
    @Test
    public void test_that_save_is_false(){
        ComponentTypeDTO newComponentTypeDTO = new ComponentTypeDTO();
        int size = componentTypeService.findAll().size();
        Assertions.assertFalse(componentTypeService.saveComponentType(newComponentTypeDTO));
        Assertions.assertEquals(size,componentTypeService.findAll().size());
    }
}
