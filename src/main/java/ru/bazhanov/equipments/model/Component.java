package ru.bazhanov.equipments.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "components")
public class Component {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "component_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "component_type_id")
    private ComponentType componentType;
    @Column(name = "component_name")
    private String name;
    @Column(name = "component_description")
    private String description;

    @ManyToMany(mappedBy = "component",cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    },fetch = FetchType.LAZY)
    private Set<Element> elementSet;

    public Component() {
    }

    public Component(ComponentType type, String name, String description) {
        this.componentType = type;
        this.name = name;
        this.description = description;
    }

    public Set<Element> getElementSet(){
        return this.elementSet;
    }

    public Integer getId() {
        return id;
    }


    public ComponentType getType() {
        return componentType;
    }

    public void setType(ComponentType type) {
        this.componentType = type;
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
