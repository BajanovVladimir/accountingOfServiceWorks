package ru.bazhanov.equipments.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bazhanov.equipments.dto.ProductDTO;
import ru.bazhanov.equipments.model.Product;
import ru.bazhanov.equipments.repository.ProductRepository;
import ru.bazhanov.equipments.service.interfaces.ProductService;

import java.util.List;

@Service
public class ProductBDServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Boolean save(ProductDTO productDTO) {
        if(productDTO != null || productDTO.getName() != null || productDTO.getName() != ""){
            productRepository.save(new Product(productDTO.getName()));
            return true;
        }
        return false;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
