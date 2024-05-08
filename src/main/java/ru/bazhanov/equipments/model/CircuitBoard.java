package ru.bazhanov.equipments.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "circuit_boards")
public class CircuitBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="circuit_board_id")
    private Integer id;

    @Column(name = "circuit_board_name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToMany(mappedBy = "circuitBoard")
    private Set<Element> elementSet = new HashSet<>();


    CircuitBoard(){}
    public CircuitBoard(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Element> getElementSet() {
        return elementSet;
    }

    public void setElementSet(Set<Element> elementSet) {
        this.elementSet = elementSet;
    }
}
