package com.repository;

import com.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "select c.* from `customer` c join `customer_type` ct on c.customer_type_id = ct.id where c.name like concat ('%',:name,'%') and ct.name like ('%',:customerType,'%') and c.email like concat ('%',:email,'%')", nativeQuery = true)
    Page<Customer> searchName(@Param("name") String name, @Param("email") String email, @Param("customerType") String customerType, Pageable pageable);
//  @Query(value = "select * from customer where name like concat('%',:name,'%') and email like concat('%',:email,'%')", nativeQuery = true)
//    Page<Customer> searchName(@Param("name") String name, @Param("email") String email, Pageable pageable);
}
