package ru.bazhanov.equipments.model;

import java.time.Year;

public class Equipment {
    private int id;
    private Product product;
    private String type;
    private String factoryNumber;
    private Year yearOfProduction;
    private Boolean warranty;

    Equipment(){};

    public int getId() {
        return this.id;
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

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Year yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
