package ru.bazhanov.equipments.model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class CircuitBoard {
    private Integer id;
    private String name;
    private List<Element> elementList;
}
