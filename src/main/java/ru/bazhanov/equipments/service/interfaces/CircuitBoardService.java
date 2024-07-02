package ru.bazhanov.equipments.service.interfaces;

import ru.bazhanov.equipments.model.CircuitBoard;

import java.util.List;

public interface CircuitBoardService {
    Boolean save();
    List<CircuitBoard> findAll();
}
