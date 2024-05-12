package ru.bazhanov.equipments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.equipments.model.ComponentType;

public interface ComponentTypeRepository extends JpaRepository<ComponentType,Integer> {
}
