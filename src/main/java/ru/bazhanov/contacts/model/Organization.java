package ru.bazhanov.contacts.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "organizations")
public class Organization  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organization_id")
    private Integer id;
    @Column(name = "organization_name")
    private String name;
    private String city;
    @OneToMany(mappedBy = "organization")
    private  List<Person> personList = new LinkedList<>();

    public Organization(){}

    public Organization(String name, String city){
        this.name = name;
        this.city = city;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
