package com.example.ordermanagementsystem.services.implementations;

import com.example.ordermanagementsystem.exeptions.IdNotFoundException;
import com.example.ordermanagementsystem.models.Customer;
import com.example.ordermanagementsystem.repoistory.CustomerRepository;
import com.example.ordermanagementsystem.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }
    public Customer findById(Long id) throws IdNotFoundException {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        if(!customerOptional.isPresent()) {
            throw new IdNotFoundException(id);
        }

        return customerOptional.get();
    }
}
