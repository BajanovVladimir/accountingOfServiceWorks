package ru.bazhanov.equipments.dto;

import ru.bazhanov.equipments.model.Product;

public class CircuitBoardDTO {
    private String name;
    private Product product;
    public CircuitBoardDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
