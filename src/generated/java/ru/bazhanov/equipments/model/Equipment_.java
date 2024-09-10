package ru.bazhanov.equipments.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Equipment.class)
public abstract class Equipment_ {

	public static volatile SingularAttribute<Equipment, Product> product;
	public static volatile SingularAttribute<Equipment, String> name;
	public static volatile SingularAttribute<Equipment, LocalDate> yearOfProduction;
	public static volatile SingularAttribute<Equipment, Boolean> warranty;
	public static volatile SingularAttribute<Equipment, Integer> id;
	public static volatile SingularAttribute<Equipment, String> type;
	public static volatile SingularAttribute<Equipment, String> factoryNumber;

	public static final String PRODUCT = "product";
	public static final String NAME = "name";
	public static final String YEAR_OF_PRODUCTION = "yearOfProduction";
	public static final String WARRANTY = "warranty";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String FACTORY_NUMBER = "factoryNumber";

}

