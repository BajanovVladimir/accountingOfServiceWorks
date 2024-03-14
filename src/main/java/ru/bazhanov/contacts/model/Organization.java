package ru.bazhanov.contacts.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

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

    public Organization(){}

    public Organization(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return name.equals(that.name) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
