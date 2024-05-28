package ru.bazhanov.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.contacts.model.Organization;
import ru.bazhanov.contacts.model.Person;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer> {
    Person findByLastNameAndFirstNameAndPatronymicAndOrganization(String lastName, String firstName, String patronymic, Organization organization);
}
