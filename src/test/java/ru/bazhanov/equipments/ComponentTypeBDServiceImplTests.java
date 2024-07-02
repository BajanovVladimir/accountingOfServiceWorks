package ru.bazhanov.equipments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.model.ComponentType;
import ru.bazhanov.equipments.service.interfaces.ComponentTypeService;

import java.util.List;

@SpringBootTest
public class ComponentTypeBDServiceImplTests {
    @Autowired
    private ComponentTypeService componentTypeService;

    @Test
    public void test_that_save_is_true(){
        ComponentTypeDTO newComponentTypeDTO = new ComponentTypeDTO();
        newComponentTypeDTO.setName("newComponent");
        int size = componentTypeService.findAll().size();
        Assertions.assertTrue(componentTypeService.save(newComponentTypeDTO));
        Assertions.assertEquals(size+1,componentTypeService.findAll().size());
    }
    @Test
    public void test_that_save_is_false(){
        ComponentTypeDTO newComponentTypeDTO = new ComponentTypeDTO();
        int size = componentTypeService.findAll().size();
        Assertions.assertFalse(componentTypeService.save(newComponentTypeDTO));
        Assertions.assertEquals(size,componentTypeService.findAll().size());
    }
    @Test
    public void test_that_findAll_is_sorted(){
        ComponentTypeDTO aComponentType = new ComponentTypeDTO();
        aComponentType.setName("aComponentType");
        ComponentTypeDTO bComponentType = new ComponentTypeDTO();
        bComponentType.setName("bComponentType");
        ComponentTypeDTO dComponentType = new ComponentTypeDTO();
        dComponentType.setName("dComponentType");
        ComponentTypeDTO lComponentType = new ComponentTypeDTO();
        lComponentType.setName("lComponentType");
        componentTypeService.save(lComponentType);
        componentTypeService.save(aComponentType);
        componentTypeService.save(dComponentType);
        componentTypeService.save(bComponentType);
        List<ComponentType> componentTypeList = componentTypeService.findAll();
        Assertions.assertEquals("aComponentType",componentTypeList.get(0).getName());
        Assertions.assertEquals("lComponentType",componentTypeList.get(3).getName());
    }
}
