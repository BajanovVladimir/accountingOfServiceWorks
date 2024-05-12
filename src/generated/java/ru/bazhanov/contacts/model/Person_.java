package ru.bazhanov.contacts.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile ListAttribute<Person, Email> emails;
	public static volatile SingularAttribute<Person, String> lastName;
	public static volatile SingularAttribute<Person, String> firstName;
	public static volatile SingularAttribute<Person, String> patronymic;
	public static volatile SingularAttribute<Person, Organization> organization;
	public static volatile SingularAttribute<Person, Integer> id;
	public static volatile ListAttribute<Person, PhoneNumber> phoneNumbers;

	public static final String EMAILS = "emails";
	public static final String LAST_NAME = "lastName";
	public static final String FIRST_NAME = "firstName";
	public static final String PATRONYMIC = "patronymic";
	public static final String ORGANIZATION = "organization";
	public static final String ID = "id";
	public static final String PHONE_NUMBERS = "phoneNumbers";

}

