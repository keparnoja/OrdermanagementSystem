package com.example.ordermanagementsystem.services;

import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.Product;

public interface ProductService {
    void createProduct(Product product);

    Product findBySku(Long id) throws IdNotFoundException;
}
