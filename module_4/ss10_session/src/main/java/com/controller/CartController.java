package com.controller;

import com.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class CartController {
    @GetMapping("")
    public String showCart(@SessionAttribute("cart")CartDto cart, Model model){
        model.addAttribute("cart",cart);
        return "cart/list";
    }
}
