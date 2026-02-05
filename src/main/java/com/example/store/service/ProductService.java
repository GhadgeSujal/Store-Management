package com.example.store.service;

import com.example.store.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private Long idCounter = 1L;

    // Add new product
    public Product addProduct(Product product) {
        product.setId(idCounter++);
        products.add(product);
        return product;
    }

    // Get product by ID
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
}
