package ru.bazhanov.equipments.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.model.ComponentType;
import ru.bazhanov.equipments.repository.ComponentTypeRepository;
import ru.bazhanov.equipments.service.interfaces.ComponentTypeService;

import java.util.List;

@Service
public class ComponentTypeBDServiceImpl implements ComponentTypeService {


    private final ComponentTypeRepository componentTypeRepository;
    @Autowired
    public ComponentTypeBDServiceImpl(ComponentTypeRepository componentTypeRepository) {
        this.componentTypeRepository = componentTypeRepository;
    }

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
        return componentTypeRepository.findAll(Sort.by(Sort.Order.asc("name")));
    }

    @Override
    public ComponentType findByID(int typeID) {
        return componentTypeRepository.getReferenceById(typeID);
    }
}
