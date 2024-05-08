package ru.bazhanov.equipments.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "product_name")
    private String name;

    @OneToMany(mappedBy = "product")
    private List<CircuitBoard> circuitBoardList;

    Product(){}
    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CircuitBoard> getCircuitBoardList() {
        return circuitBoardList;
    }

}
