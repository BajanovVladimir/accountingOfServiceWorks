package ru.bazhanov.contacts.model;

import jakarta.persistence.*;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Integer id;

    private String email;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;


    public Email(){}
    public Email(Person person, String email){
        this.email = email;
        this.person = person;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public Integer getId(){
        return this.id;
    }
    public Person getPerson(){
        return this.person;
    }

}
