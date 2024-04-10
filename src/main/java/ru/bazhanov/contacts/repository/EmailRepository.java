package ru.bazhanov.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.contacts.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {

}
