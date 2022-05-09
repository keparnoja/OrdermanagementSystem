package com.example.ordermanagementsystem.services.implementations;

import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Orders;
import com.example.ordermanagementsystem.repoistory.OrderLineRepository;
import com.example.ordermanagementsystem.repoistory.OrderRepository;
import com.example.ordermanagementsystem.services.OrdersService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired
    private OrderRepository orderRepository;




    @Override
    public void createOrders(Orders orders) {
        orderRepository.save(orders);
    }

    @Override
    public List<Orders> findOrderByDate(Date date) {
        List<Orders> ordersList = orderRepository.findByDate(date);
        return  ordersList;
    }

    @Override
    public List<Orders> findOrdersByCustomer(Customer customer) {
        return orderRepository.findOrdersByCustomer(customer);
    }


    @Override
    public List<Orders> findAllOrders() {
        return orderRepository.findAll();
    }

}
