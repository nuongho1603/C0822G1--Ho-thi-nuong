package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/currency")
public class CurrencyConverterAppController {
    @RequestMapping("")
    public String display(){
        return "/app/display";
    }
    @RequestMapping("/app")
    public String converter(Model model, double usd,double price) {
        Double vnd = usd * price;
        model.addAttribute("usd",usd);
        model.addAttribute("price",price);
        model.addAttribute("vnd", vnd);
        return "app/display";
    }
}
