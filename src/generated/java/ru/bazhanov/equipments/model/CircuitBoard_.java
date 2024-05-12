package ru.bazhanov.equipments.model;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CircuitBoard.class)
public abstract class CircuitBoard_ {

	public static volatile SingularAttribute<CircuitBoard, Product> product;
	public static volatile SetAttribute<CircuitBoard, Element> elementSet;
	public static volatile SingularAttribute<CircuitBoard, String> name;
	public static volatile SingularAttribute<CircuitBoard, Integer> id;

	public static final String PRODUCT = "product";
	public static final String ELEMENT_SET = "elementSet";
	public static final String NAME = "name";
	public static final String ID = "id";

}

