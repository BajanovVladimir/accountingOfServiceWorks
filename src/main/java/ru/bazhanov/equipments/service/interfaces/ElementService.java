package ru.bazhanov.equipments.service.interfaces;

import ru.bazhanov.equipments.dto.ElementDTO;
import ru.bazhanov.equipments.model.Element;

import java.util.List;

public interface ElementService {
    Boolean save(ElementDTO elementDTO);
    List<Element> findAll();
}
