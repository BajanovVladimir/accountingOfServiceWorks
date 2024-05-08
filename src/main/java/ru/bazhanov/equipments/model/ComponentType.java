package ru.bazhanov.equipments.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "component_types")
public class ComponentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "component_type_id")
    private Integer id;
    @Column(name = "component_type_name")
    private String name;
    @OneToMany(mappedBy = "componentType")
    private Set<Component> componentSet;

    ComponentType(){};
    public ComponentType(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Component> getComponentSet() {
        return componentSet;
    }
}
