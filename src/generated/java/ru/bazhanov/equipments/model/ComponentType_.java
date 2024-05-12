package ru.bazhanov.equipments.model;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ComponentType.class)
public abstract class ComponentType_ {

	public static volatile SingularAttribute<ComponentType, String> name;
	public static volatile SetAttribute<ComponentType, Component> componentSet;
	public static volatile SingularAttribute<ComponentType, Integer> id;

	public static final String NAME = "name";
	public static final String COMPONENT_SET = "componentSet";
	public static final String ID = "id";

}

