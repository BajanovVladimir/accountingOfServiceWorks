package ru.bazhanov.contacts.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Email.class)
public abstract class Email_ {

	public static volatile SingularAttribute<Email, Person> person;
	public static volatile SingularAttribute<Email, Integer> id;
	public static volatile SingularAttribute<Email, String> email;

	public static final String PERSON = "person";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

