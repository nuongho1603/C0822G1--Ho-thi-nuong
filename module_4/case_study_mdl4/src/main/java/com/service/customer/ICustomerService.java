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
    boolean save(Customer customer);
    Customer findById(int id);

    Page<Customer> searchName(String name, String customerType,String email, Pageable pageable);

    void remove(int id);
//    Page<Customer> searchName(String name, String email,  Pageable pageable);
}
