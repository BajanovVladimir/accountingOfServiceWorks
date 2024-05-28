package ru.bazhanov.equipments.model;

import jakarta.persistence.*;

import java.util.HashSet;

import java.util.Set;

@Entity
@Table(name = "component_types")
public class ComponentType implements Comparable<ComponentType> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "component_type_id")
    private Integer id;
    @Column(name = "component_type_name")
    private String name;
    @OneToMany(mappedBy = "componentType")
    private Set<Component> componentSet = new HashSet<>();

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

    @Override
    public int compareTo(ComponentType o) {
        return name.compareTo(o.name);
    }
}
