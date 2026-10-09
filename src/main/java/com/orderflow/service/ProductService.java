package com.orderflow.service;

import com.orderflow.entity.Product;
import com.orderflow.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    };
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    };
    public Product saveProduct(Product product){
        return productRepository.save(product);
    };
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    };
}
