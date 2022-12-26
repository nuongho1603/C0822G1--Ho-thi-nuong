package com.service.customer;

import com.model.customer.Customer;

import java.awt.image.VolatileImage;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Optional<Customer> findById(int id);
}
