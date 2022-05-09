package com.example.ordermanagementsystem.services.implementations;

import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.Product;
import com.example.ordermanagementsystem.repoistory.ProductRepository;
import com.example.ordermanagementsystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl  implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }
    @Override
    public Product findBySku(Long id) throws IdNotFoundException {
        Product productOptional = productRepository.findBySkuCode(id);
        return productOptional;
    }
}
