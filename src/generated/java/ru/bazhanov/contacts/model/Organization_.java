package ru.bazhanov.contacts.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Organization.class)
public abstract class Organization_ {

	public static volatile ListAttribute<Organization, Person> personList;
	public static volatile SingularAttribute<Organization, String> city;
	public static volatile SingularAttribute<Organization, String> name;
	public static volatile SingularAttribute<Organization, Integer> id;

	public static final String PERSON_LIST = "personList";
	public static final String CITY = "city";
	public static final String NAME = "name";
	public static final String ID = "id";

}

