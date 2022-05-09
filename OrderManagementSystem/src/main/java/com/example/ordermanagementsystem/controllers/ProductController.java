package com.example.ordermanagementsystem.controllers;

import com.example.ordermanagementsystem.models.Product;
import com.example.ordermanagementsystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return ResponseEntity.ok(null);
    }
}
