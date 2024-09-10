package ru.bazhanov.equipments.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.bazhanov.equipments.dto.EquipmentDTO;
import ru.bazhanov.equipments.model.Equipment;
import ru.bazhanov.equipments.repository.EquipmentRepository;
import ru.bazhanov.equipments.service.interfaces.EquipmentService;

import java.util.List;

@Service
public class EquipmentBDImpl implements EquipmentService {
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Override
    public Boolean save(EquipmentDTO equipmentDTO) {
        return null;
    }

    @Override
    public List<Equipment> findAll() {
        return equipmentRepository.findAll(Sort.by(Sort.Order.asc("name")));
    }
}
