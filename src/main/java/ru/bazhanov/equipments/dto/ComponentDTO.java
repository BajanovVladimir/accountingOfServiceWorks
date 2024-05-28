package ru.bazhanov.equipments.dto;

import ru.bazhanov.equipments.model.ComponentType;

public class ComponentDTO {
    private ComponentType type;
    private String name;
    private String description;
    public ComponentDTO(){}

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
