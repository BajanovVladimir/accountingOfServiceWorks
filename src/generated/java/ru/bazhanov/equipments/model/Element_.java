package ru.bazhanov.equipments.model;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Element.class)
public abstract class Element_ {

	public static volatile SetAttribute<Element, Component> components;
	public static volatile SingularAttribute<Element, CircuitBoard> circuitBoard;
	public static volatile SingularAttribute<Element, String> name;
	public static volatile SingularAttribute<Element, String> description;
	public static volatile SingularAttribute<Element, Integer> id;

	public static final String COMPONENTS = "components";
	public static final String CIRCUIT_BOARD = "circuitBoard";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

