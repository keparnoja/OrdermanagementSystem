package com.example.ordermanagementsystem.controllers;

import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/create")
    public ResponseEntity<?>createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
        return ResponseEntity.ok(null);
    }
}
