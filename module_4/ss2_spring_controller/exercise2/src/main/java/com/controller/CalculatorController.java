package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @RequestMapping("")
    public String calculationForm() {
        return "/form";
    }

    @RequestMapping("/result")
    public String calculation(Model model, @RequestParam("number1") double number1, @RequestParam("number2") double number2, @RequestParam("result") String result) {
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        Double rs;
        switch (result) {
            case "additon":
                rs = number1 +number2;
                model.addAttribute("rs",rs);
                break;
            case "subtraction":
                rs = number1 - number2;
                model.addAttribute("rs",rs);
                break;
            case "multiplication":
                rs = number1 * number2;
                model.addAttribute("rs",rs);
                break;
            case "division":
                rs = number1 / number2;
                model.addAttribute("rs",rs);
                break;
        }
        model.addAttribute("result",result);
        return "/form";
    }
}
