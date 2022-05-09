package com.example.ordermanagementsystem.repoistory;

import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Orders;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;


public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByDate(Date date);
    List<Orders> findOrdersByCustomer(Customer customer);


}
