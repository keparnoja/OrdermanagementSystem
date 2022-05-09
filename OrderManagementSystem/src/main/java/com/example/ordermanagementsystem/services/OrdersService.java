package com.example.ordermanagementsystem.services;

import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Orders;

import java.sql.Date;
import java.util.List;

public interface OrdersService {
    void createOrders (Orders orders);


    List<Orders> findAllOrders();
    List<Orders> findOrderByDate (Date date);
    List<Orders> findOrdersByCustomer(Customer Customer);

}
