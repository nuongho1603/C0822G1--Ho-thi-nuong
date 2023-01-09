package com.controller;

import com.model.customer.Customer;
import com.model.customer.CustomerType;
import com.model.dto.CustomerDto;
import com.service.customer.ICustomerService;
import com.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
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
    public String show(Model model, @RequestParam(defaultValue = "") String name,
                       @RequestParam(defaultValue = "") String customerType,
                       @RequestParam(defaultValue = "") String email,
                       @PageableDefault(size = 5) Pageable pageable) {

        Page<Customer> customerPage = iCustomerService.searchName(name, customerType, email, pageable);
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();

        model.addAttribute("customerList", customerPage);
        model.addAttribute("customerTypes", customerTypes);
        return "customer/list";
    }


    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
       Customer customer = iCustomerService.findById(id);
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customer, customerDto);
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerTypes", customerTypes);
        return "customer/edit";
    }

    @PostMapping("/save")
    public String save(Model model, @Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()) {
            List<CustomerType> customerTypes = iCustomerTypeService.findAll();
            model.addAttribute("customerTypes",customerTypes);
            return "customer/edit";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        iCustomerService.save(customer);

        redirectAttributes.addFlashAttribute("mess", "Bạn đã thao tác thành công! ");
        return "redirect:/customer";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
//        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
//        model.addAttribute("customer", new Customer());
//        model.addAttribute("customerTypes", customerTypes);

        model.addAttribute("customerDto", new CustomerDto());
        List<CustomerType> customerTypes = iCustomerTypeService.findAll();
        model.addAttribute("customerTypes", customerTypes);
        return "customer/create";
    }

    @PostMapping("/delete")
    public String delete(int deleteId, RedirectAttributes redirectAttributes) {
        iCustomerService.remove(deleteId);
        redirectAttributes.addFlashAttribute("mess", "Xóa thành công!");
        return "redirect:/customer";
    }
}
