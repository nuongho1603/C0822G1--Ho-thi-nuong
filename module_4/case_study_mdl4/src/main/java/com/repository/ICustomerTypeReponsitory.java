package com.repository;

import com.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeReponsitory extends JpaRepository<CustomerType, Integer> {
}
