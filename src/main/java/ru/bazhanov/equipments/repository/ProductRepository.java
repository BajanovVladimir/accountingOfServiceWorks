package ru.bazhanov.equipments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bazhanov.equipments.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
