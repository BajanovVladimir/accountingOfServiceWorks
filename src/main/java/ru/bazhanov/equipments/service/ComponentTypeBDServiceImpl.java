package ru.bazhanov.equipments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.model.ComponentType;
import ru.bazhanov.equipments.repository.ComponentTypeRepository;

import java.util.Collections;
import java.util.List;

@Service
public class ComponentTypeBDServiceImpl implements ComponentTypeService{

    @Autowired
    private ComponentTypeRepository componentTypeRepository;

    @Override
    public Boolean save(ComponentTypeDTO componentTypeDTO) {
        if (componentTypeDTO == null || componentTypeDTO.getName() == null) {
           return false;
        }
        ComponentType newComponentType = new ComponentType(componentTypeDTO.getName());
        componentTypeRepository.save(newComponentType);
        return true;
    }

    @Override
    public List<ComponentType> findAll() {
        List<ComponentType> componentTypeList = componentTypeRepository.findAll();
        Collections.sort(componentTypeList);
        return componentTypeList;
    }

    @Override
    public ComponentType findByID(int typeID) {
        return componentTypeRepository.getReferenceById(typeID);
    }
}
