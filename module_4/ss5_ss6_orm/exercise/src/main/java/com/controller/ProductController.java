package com.controller;

import com.model.Product;
import com.service.IProductService;
import com.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
  private IProductService iProductService = new ProductService();

    //    static {
//        try {
//            SessionFactory sessionFactory = new Configuration()
//                    .configure("hibernate.conf.xml")
//                    .buildSessionFactory();
//            sessionFactory.close();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        }
//    }
    @RequestMapping("")
    public String show(Model model) {
        List<Product> productList = iProductService.selectAllProduct();
        model.addAttribute("productList", productList);
        return "/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        Product product = iProductService.selectById(id);
        model.addAttribute("product", product);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("product") Product product) {
        iProductService.update(product);
        List<Product> productList = iProductService.selectAllProduct();
        model.addAttribute("productList", productList);
        model.addAttribute("mess", "Edit product thành công! ");
        return "/list";


    }

    @PostMapping("/search")
    public String search(Model model, String name) {
        List<Product> products = iProductService.searchByName(name);
        model.addAttribute("productList", products);
        return "/list";
    }

    @RequestMapping("/view/{id}")
    public String view(Model model, @PathVariable("id") int id) {
        Product product = iProductService.selectById(id);
        model.addAttribute("product", product);
        return "/view";
    }

    @GetMapping("/add")
    public String showFormAdd(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute("product") Product product) {
        iProductService.addProduct(product);
        List<Product> productList = iProductService.selectAllProduct();
        model.addAttribute("productList", productList);
        model.addAttribute("mess", "Add product thành công! ");
        return "/list";
    }

    @PostMapping("/delete")
    public String delete(Model model, @RequestParam("deleteId") int id) {
        iProductService.delete(id);
        List<Product> productList = iProductService.selectAllProduct();
        model.addAttribute("productList", productList);
        model.addAttribute("mess", "Delete product thành công! ");
        return "/list";
    }
}
