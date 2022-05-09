package com.example.ordermanagementsystem.repoistory;

import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineRepository  extends JpaRepository<OrderLine, Long> {


}
