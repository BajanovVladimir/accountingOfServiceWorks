package ru.bazhanov.equipments.service.interfaces;

import ru.bazhanov.equipments.dto.EquipmentDTO;
import ru.bazhanov.equipments.model.Equipment;

import java.util.List;

public interface EquipmentService {
    Boolean save(EquipmentDTO equipmentDTO);
    List<Equipment> findAll();
}
