package ru.bazhanov.equipments.service.interfaces;

import ru.bazhanov.equipments.dto.ProductDTO;
import ru.bazhanov.equipments.model.Product;

import java.util.List;

public interface ProductService {
    Boolean save (ProductDTO productDTO);
    List<Product> findAll();
}
