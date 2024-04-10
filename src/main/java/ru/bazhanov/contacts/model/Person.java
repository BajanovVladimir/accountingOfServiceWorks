package ru.bazhanov.contacts.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    private String patronymic;
    @OneToMany(mappedBy = "person")
    private List<PhoneNumber> phoneNumbers;
    @OneToMany(mappedBy = "person")
    private List<Email> emails ;

    @ManyToOne()
    @JoinColumn(name = "organization_id")
    private Organization organization;

    Person(){}

    public Person(String lastName, String firstName, String patronymic,  Organization organization){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.organization = organization;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getPatronymic(){
        return this.patronymic;
    }

    public List<PhoneNumber> getPhoneNumbers(){
        return this.phoneNumbers;
    }

    public List<Email> getEmail(){
        return this.emails;
    }
}
