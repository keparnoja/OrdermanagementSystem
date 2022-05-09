package com.example.ordermanagementsystem.services.implementations;

import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.OrderLine;
import com.example.ordermanagementsystem.models.Product;
import com.example.ordermanagementsystem.repoistory.OrderLineRepository;
import com.example.ordermanagementsystem.services.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderLineImpl implements OrderLineService {
    @Autowired
    OrderLineRepository orderLineRepository;

    @Override
    public void createOrderLine(OrderLine orderLine) {
        orderLineRepository.save(orderLine);
    }

    @Override
    public List<OrderLine> findAllOrderLines() {
        return orderLineRepository.findAll();
    }
    @Override
    public OrderLine findById(Long id) throws IdNotFoundException {
        Optional<OrderLine> orderLineOptionalOptional = orderLineRepository.findById(id);

        if(!orderLineOptionalOptional.isPresent()) {
            throw new IdNotFoundException(id);
        }

        return orderLineOptionalOptional.get();
    }


}
