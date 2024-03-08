package ru.bazhanov.contacts.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_id")
    private Integer id;
    @Column(name = "organization_name")
    private String name;
    private String city;

    @OneToMany(mappedBy = "organization")
    private List<Person> personList;

    Organization(){}

    Organization(String name, String city){
        this.name = name;
        this.city = city;

    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }
}
