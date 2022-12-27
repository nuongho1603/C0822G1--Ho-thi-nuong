package com.service.customer;

import com.model.customer.Customer;
import com.model.customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.awt.image.VolatileImage;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Optional<Customer> findById(int id);

    Page<Customer> searchName(String name, String email, String customerType, Pageable pageable);
//    Page<Customer> searchName(String name, String email,  Pageable pageable);
}
