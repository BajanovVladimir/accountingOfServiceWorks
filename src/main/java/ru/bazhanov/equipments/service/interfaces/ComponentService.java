package ru.bazhanov.equipments.service.interfaces;


import ru.bazhanov.equipments.dto.ComponentDTO;
import ru.bazhanov.equipments.model.Component;

import java.util.List;

public interface ComponentService {
    Boolean save(ComponentDTO componentDTO);
    List<Component> findAll();
}
