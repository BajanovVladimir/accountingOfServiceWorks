package ru.bazhanov.equipments.service;


import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.model.ComponentType;

import java.util.List;

public interface ComponentTypeService {
    Boolean saveComponentType(ComponentTypeDTO componentTypeDTO);
    List<ComponentType> findAll();
}
