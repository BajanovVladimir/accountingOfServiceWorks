package ru.bazhanov.equipments.service.interfaces;


import ru.bazhanov.equipments.dto.ComponentTypeDTO;
import ru.bazhanov.equipments.model.ComponentType;

import java.util.List;

public interface ComponentTypeService {
    Boolean save(ComponentTypeDTO componentTypeDTO);
    List<ComponentType> findAll();
    ComponentType findByID(int typeID);
}
