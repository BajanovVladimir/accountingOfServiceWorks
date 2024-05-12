package ru.bazhanov.contacts.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PhoneNumber.class)
public abstract class PhoneNumber_ {

	public static volatile SingularAttribute<PhoneNumber, String> phoneNumber;
	public static volatile SingularAttribute<PhoneNumber, Person> person;
	public static volatile SingularAttribute<PhoneNumber, Integer> id;

	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String PERSON = "person";
	public static final String ID = "id";

}

