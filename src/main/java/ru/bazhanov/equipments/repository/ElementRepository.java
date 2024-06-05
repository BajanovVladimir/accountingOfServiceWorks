package ru.bazhanov.equipments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.equipments.model.Element;

public interface ElementRepository extends JpaRepository<Element,Integer> {
}
