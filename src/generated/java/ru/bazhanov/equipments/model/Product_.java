package ru.bazhanov.equipments.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile ListAttribute<Product, CircuitBoard> circuitBoardList;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, Integer> id;

	public static final String CIRCUIT_BOARD_LIST = "circuitBoardList";
	public static final String NAME = "name";
	public static final String ID = "id";

}

