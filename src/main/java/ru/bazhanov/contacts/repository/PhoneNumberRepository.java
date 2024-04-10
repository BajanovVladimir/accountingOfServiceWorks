package ru.bazhanov.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.contacts.model.PhoneNumber;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {
}
