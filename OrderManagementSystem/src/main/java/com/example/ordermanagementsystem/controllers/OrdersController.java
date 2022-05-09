package com.example.ordermanagementsystem.controllers;


import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Orders;
import com.example.ordermanagementsystem.models.Product;
import com.example.ordermanagementsystem.services.CustomerService;
import com.example.ordermanagementsystem.services.OrderLineService;
import com.example.ordermanagementsystem.services.OrdersService;
import com.example.ordermanagementsystem.services.ProductService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @Autowired
    CustomerService customerService;
    @Autowired
    ProductService productService;
    @Autowired
    OrderLineService orderLineService;

    @PostMapping("/create")
    public ResponseEntity<?> createOrderLine(@RequestBody Orders orders) {
        ordersService.createOrders(orders);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/date/{date}")
    public List<Orders> findByDate(@PathVariable Date date) {
        return ordersService.findOrderByDate(date);
    }
    @GetMapping("/byCustomer/{Id}")
    public List<Orders> findByCustomer(@PathVariable Long Id) throws IdNotFoundException {
        Customer customer = customerService.findById(Id);
        return ordersService.findOrdersByCustomer(customer);
    }


}
