package ru.bazhanov.equipments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.equipments.model.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment,Integer> {
}
