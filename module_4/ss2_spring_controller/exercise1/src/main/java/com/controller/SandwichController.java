package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @RequestMapping("")
    public String form() {
        return "/form";
    }

    @RequestMapping("/save")
    public String save(Model model, @RequestParam("choice") String choice) {
        model.addAttribute("choice", choice);
        return "/form";
    }
}
