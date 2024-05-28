package ru.bazhanov.equipments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.equipments.model.Component;

public interface ComponentRepository extends JpaRepository<Component,Integer> {
}
