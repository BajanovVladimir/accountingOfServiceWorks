package ru.bazhanov.orders.model;

import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.equipments.model.Product;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date arrivalDate;
    private Organization organization;
    List<Product> productList;
    public Order(){
    }

}
