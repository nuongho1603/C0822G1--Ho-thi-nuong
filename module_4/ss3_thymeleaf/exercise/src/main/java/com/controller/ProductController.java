package com.controller;

import com.model.Product;
import com.service.IProductService;
import com.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    IProductService productService = new ProductService();

    @RequestMapping("")
    public String showForm(Model model) {
        List<Product> productList = productService.selectAllProduct();
        model.addAttribute("productList", productList);
        return "/form";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        Product product = productService.selectById(id);
        model.addAttribute("product", product);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("product") Product product, @ModelAttribute("id") int id, RedirectAttributes redirectAttributes) {
        productService.update(product, id);
        return "redirect:/product";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(Model model, @PathVariable("id") int id) {
        Product product = productService.delete(id);
        model.addAttribute("product", product);
        return "/form";
    }

    @PostMapping("/delete")
    public String delete(Model model, @ModelAttribute("id") int id, @ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        productService.update(product, id);
        return "redirect:/product";
    }

    @PostMapping("/search")
    public String search(Model model, String name) {
        List<Product> products = productService.searchByName(name);
        model.addAttribute("productList", products);
        return "/form";
    }

    @RequestMapping("/view/{id}")
    public String view(Model model, @PathVariable("id") int id) {
        Product product = productService.selectById(id);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        model.addAttribute("productList", productList);
        return "/view";
    }

}
