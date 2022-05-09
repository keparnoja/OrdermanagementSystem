package com.example.ordermanagementsystem.repoistory;

import com.example.ordermanagementsystem.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findBySkuCode(Long skuCode);
}
