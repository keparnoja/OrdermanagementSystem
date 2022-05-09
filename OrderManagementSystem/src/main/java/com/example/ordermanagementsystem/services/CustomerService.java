package com.example.ordermanagementsystem.services;

import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.Customer;



public interface CustomerService {
    void createCustomer(Customer customer);
    Customer findById(Long id) throws IdNotFoundException;


}
