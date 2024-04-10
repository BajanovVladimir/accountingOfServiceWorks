package ru.bazhanov.contacts.model;

import jakarta.persistence.*;

@Entity
@Table(name = "phone_numbers")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_number_id")
    private Integer id;

    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public PhoneNumber(){};
    public PhoneNumber(Person person,String phoneNumber){
        this.person = person;
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return  this.phoneNumber;
    }
    public Integer getId(){
        return this.id;
    }

}
