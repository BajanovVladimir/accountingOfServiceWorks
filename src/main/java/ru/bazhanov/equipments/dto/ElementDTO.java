package ru.bazhanov.equipments.dto;

import ru.bazhanov.equipments.model.Component;

public class ElementDTO {
    private String name;
    private Component component;
    private String description;
    public ElementDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
