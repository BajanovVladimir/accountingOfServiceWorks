package ru.bazhanov.equipments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        componentRepository.save(new Component(componentDTO.getType(), componentDTO.getName(), componentDTO.getDescription()));
        return true;
    }

    @Override
    public List<Component> findAll() {
        return componentRepository.findAll(Sort.by(Sort.Order.asc("name")));
    }
}
