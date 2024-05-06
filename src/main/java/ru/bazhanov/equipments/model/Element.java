package ru.bazhanov.equipments.model;

import jakarta.persistence.ManyToMany;

import java.util.Set;

public class Element {
    private Integer id;
    private String designation;
    private String description;
    @ManyToMany
    private Set<Component> component;
}
