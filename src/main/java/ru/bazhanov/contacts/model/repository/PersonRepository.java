package ru.bazhanov.contacts.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.contacts.model.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer> {
    List<Person> findByLastName(String lastName);
    List<Person> findByFirstName(String firstName);
    Person findByLastNameAndFirstName(String lastName, String firstName);
}
