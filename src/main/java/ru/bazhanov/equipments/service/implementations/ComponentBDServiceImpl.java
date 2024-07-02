package ru.bazhanov.equipments.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bazhanov.equipments.dto.ComponentDTO;
import ru.bazhanov.equipments.dto.ElementDTO;
import ru.bazhanov.equipments.model.Component;
import ru.bazhanov.equipments.model.Element;
import ru.bazhanov.equipments.repository.ComponentRepository;
import ru.bazhanov.equipments.repository.ElementRepository;
import ru.bazhanov.equipments.service.interfaces.ComponentService;
import ru.bazhanov.equipments.service.interfaces.ComponentTypeService;
import ru.bazhanov.equipments.service.interfaces.ElementService;

import java.util.List;

@Service
public class ComponentBDServiceImpl implements ComponentService {
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

    @Service
    public static class ElementBDServiceImpl implements ElementService {
        @Autowired
        ElementRepository elementRepository;
        @Autowired
        ComponentRepository components;

        @Override
        public Boolean save(ElementDTO elementDTO) {
            if(elementDTO == null || elementDTO.getName() == null || elementDTO.getComponent() == null){
                return false;
            }
            Element newElement = new Element(elementDTO.getName(), elementDTO.getDescription());
            newElement.getComponents().add(elementDTO.getComponent());
            elementRepository.save(newElement);
            return true;
        }

        @Override
        public List<Element> findAll() {
            return elementRepository.findAll();
        }
    }
}
