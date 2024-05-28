package ru.bazhanov.equipments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bazhanov.equipments.dto.ComponentDTO;
import ru.bazhanov.equipments.model.Component;
import ru.bazhanov.equipments.repository.ComponentRepository;

import java.util.List;

@Service
public class ComponentBDServiceImpl implements ComponentService{
    @Autowired
    ComponentTypeService componentTypeService;

    @Autowired
    ComponentRepository componentRepository;

    @Override
    public Boolean save(ComponentDTO componentDTO) {
        if(componentDTO == null){
            return false;
        }
        if(componentDTO.getName() == null || componentDTO.getType() == null){
            return false;
        }
        if(componentRepository.save(new Component(componentDTO.getType(),componentDTO.getName(),componentDTO.getDescription())) == null){
            return  false;
        }
        return true;
    }

    @Override
    public List<Component> findAll() {
        return null;
    }
}
