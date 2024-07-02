package ru.bazhanov.equipments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.equipments.model.CircuitBoard;

public interface CircuitBoardRepository extends JpaRepository<CircuitBoard, Integer> {
}
