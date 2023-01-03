package com.service.customer.impl;

import com.model.customer.Customer;
import com.model.customer.CustomerType;
import com.repository.ICustomerRepository;
import com.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
@Autowired
 private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public boolean save(Customer customer) {
        for (int i = 0; i <findAll().size() ; i++) {
         if (customer.getIdCard().equals(findAll().get(i).getIdCard())) {
             return false;
         }
        }
        iCustomerRepository.save(customer);
        return true;
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.getReferenceById(id);
    }

    @Override
    public Page<Customer> searchName(String name, String customerType, String email, Pageable pageable) {
        return iCustomerRepository.searchName(name,customerType,email,pageable);
    }

    @Override
    public void remove(int id) {
        iCustomerRepository.deleteById(id);
    }
//    public Page<Customer> searchName(String name, String email,  Pageable pageable) {
//        return iCustomerRepository.searchName(name,email,pageable);
//    }
}
