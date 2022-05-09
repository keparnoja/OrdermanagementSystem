package com.example.ordermanagementsystem.services;

import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Product;

import java.util.List;

public interface OrderLineService {
    void createOrderLine(OrderLine orderLine);

    List<OrderLine> findAllOrderLines();

    OrderLine findById(Long id) throws IdNotFoundException;


}
