package com.service.customer.impl;

import com.model.customer.CustomerType;
import com.repository.ICustomerTypeReponsitory;
import com.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeReponsitory iCustomerTypeReponsitory;
    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeReponsitory.findAll();
    }
}
