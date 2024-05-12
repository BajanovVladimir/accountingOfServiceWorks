package ru.bazhanov.equipments.model;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Component.class)
public abstract class Component_ {

	public static volatile SingularAttribute<Component, ComponentType> componentType;
	public static volatile SetAttribute<Component, Element> elementSet;
	public static volatile SingularAttribute<Component, String> name;
	public static volatile SingularAttribute<Component, String> description;
	public static volatile SingularAttribute<Component, Integer> id;

	public static final String COMPONENT_TYPE = "componentType";
	public static final String ELEMENT_SET = "elementSet";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

