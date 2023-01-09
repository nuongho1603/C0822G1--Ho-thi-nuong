package com.controller.rest;

import com.model.customer.Customer;
import com.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api-viewCustomerDetail")
@CrossOrigin("*")
public class ViewCustomerDetailRest {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/view/{id}")
    public ResponseEntity<Customer> view(@PathVariable("id") int id) {
        Customer customer = iCustomerService.findById(id);
        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
