package ru.bazhanov.equipments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bazhanov.equipments.dto.ComponentDTO;
import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.model.ComponentType;
import ru.bazhanov.equipments.service.ComponentService;
import ru.bazhanov.equipments.service.ComponentTypeService;

import java.util.List;

@SpringBootTest
public class ComponentBDServiceImplTests {
    @Autowired
    ComponentService componentService;
    @Autowired
    ComponentTypeService componentTypeService;

    @BeforeEach
    public void init(){
        ComponentTypeDTO  componentTypeDTO = new ComponentTypeDTO();
        componentTypeDTO.setName("type1");
        componentTypeService.save(componentTypeDTO);
        componentTypeDTO.setName("type2");
        componentTypeService.save(componentTypeDTO);

    }

    @Test
    public void test_that_save_is_ok(){
        List<ComponentType> typeList = componentTypeService.findAll();
        ComponentType type = typeList.get(0);
        ComponentDTO componentDTO = new ComponentDTO();
        componentDTO.setName("component1");
        componentDTO.setDescription("description1");
        componentDTO.setType(type);
        int size = componentService.findAll().size();
        Assertions.assertTrue(componentService.save(componentDTO));
        Assertions.assertEquals(size+1,componentService.findAll().size());
    }
}
