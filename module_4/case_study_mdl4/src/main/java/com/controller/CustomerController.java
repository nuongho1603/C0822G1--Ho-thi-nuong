package com.controller;

import com.model.customer.Customer;
import com.model.customer.CustomerType;
import com.service.customer.ICustomerService;
import com.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
@Autowired
    private ICustomerService iCustomerService;
@Autowired
private ICustomerTypeService iCustomerTypeService;


    @RequestMapping("")
    public String show(Model model) {
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customerList", customerList);
        return "/customer/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
        model.addAttribute("customerTypes", customerTypes);
        Optional<Customer> customer = iCustomerService.findById(id);
        model.addAttribute("customer", customer);
        return "/customer/edit";
    }

    @PostMapping("/save")
    public String edit(Model model, @ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        iCustomerService.save(customer);
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customerList", customerList);
        model.addAttribute("mess", "Bạn đã thao tác thành công! ");
        return "/customer";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypes", customerTypes);
        return "/customer/create";
    }
}
