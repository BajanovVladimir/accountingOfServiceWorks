package ru.bazhanov.equipments.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "elements")
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "element_id")
    private Integer id;

    @Column(name = "element_name")
    private String name;


    @Column(name = "element_description")
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "elements_components",
            joinColumns = @JoinColumn(name = "element_id"),
            inverseJoinColumns = @JoinColumn(name = "component_id")
    )
    private Set<Component> components = new HashSet<>();
    @ManyToOne()
    @JoinColumn(name = "circuit_board_id")
    private CircuitBoard circuitBoard;

    Element(){}
    public Element(String name,  String description){
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Component> getComponents() {
        return components;
    }

    public void setComponents(Set<Component> components) {
        this.components = components;
    }

    public CircuitBoard getCircuitBoard() {
        return circuitBoard;
    }

    public void setCircuitBoard(CircuitBoard circuitBoard) {
        this.circuitBoard = circuitBoard;
    }
}
