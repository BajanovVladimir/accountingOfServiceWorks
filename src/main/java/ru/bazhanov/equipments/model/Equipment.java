package ru.bazhanov.equipments.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "equipments")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_id")
    private int id;
    @Column(name = "equipment_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "equipment_type")
    private String type;
    @Column(name = "equipment_number")
    private String factoryNumber;
    @Column(name = "equipment_date")
    private LocalDate yearOfProduction;
    @Column(name = "equipment_warranty")
    private Boolean warranty;

    Equipment(){}

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWarranty() {
        return warranty;
    }

    public void setWarranty(Boolean warranty) {
        this.warranty = warranty;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public LocalDate getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(LocalDate yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
