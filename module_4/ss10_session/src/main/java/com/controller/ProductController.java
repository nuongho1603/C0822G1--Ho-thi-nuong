package com.controller;

import com.dto.CartDto;
import com.dto.ProductDto;
import com.model.Product;
import com.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
@RequestMapping("/shop")
@SessionAttributes("cart") //khai báo session (phải có 's')
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart") //khởi tạo giá trị ban đầu cho session
    public CartDto initCart() {
        return new CartDto(); //Tạo giỏ hàng rỗng.
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable int id, @SessionAttribute("cart") CartDto cartDto) {
        Optional<Product> product = iProductService.findById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product.get(), productDto);
        cartDto.addProduct(productDto);
        return "redirect:/cart";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, HttpServletResponse response, Model model) {
        Cookie cookie = new Cookie("idProduct", String.valueOf(id));
        cookie.setMaxAge(20);
        cookie.setPath("/");
        response.addCookie(cookie);
        model.addAttribute("product", iProductService.findById(id).get());
        return "product/detail";
    }

    @GetMapping("")
    public String showListPage(@CookieValue(value = "idProduct",defaultValue = "-1")int idProduct,Model model){
        if (idProduct!=-1){
            model.addAttribute("historyProduct",iProductService.findById(idProduct).get());
        }
        model.addAttribute("productList",iProductService.findAll());
        return "product/list";
    }
}
