package com.example.ordermanagementsystem.controllers;

import com.example.ordermanagementsystem.models.OrderLine;

import com.example.ordermanagementsystem.services.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderLine")
public class OrderLineController {
    @Autowired
    OrderLineService orderLineService;
    @PostMapping("/create")
    public ResponseEntity<?> createOrderLine(@RequestBody OrderLine orderLine){
        orderLineService.createOrderLine(orderLine);
        return ResponseEntity.ok(null);
    }
    @GetMapping
    List<OrderLine> findAllOrderLines(){
        return orderLineService.findAllOrderLines();
    }

}
