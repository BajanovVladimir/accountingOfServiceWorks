package ru.bazhanov.contacts.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.contacts.model.Organization;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization,Integer> {
    Organization findByName(String name);
    List<Organization> findByCity(String city);
}