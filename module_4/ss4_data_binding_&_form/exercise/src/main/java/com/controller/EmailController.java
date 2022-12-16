package com.controller;

import com.modal.Email;
import com.service.EmailService;
import com.service.IEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    IEmailService iEmailService = new EmailService();

    @RequestMapping("")
    public String showLish(Model model) {
        List<Email> emailList = iEmailService.selectAllEmail();
        model.addAttribute("emailList", emailList);
        return "/list";
    }

    @GetMapping("/show-form/{id}")
    public String showUpdate(Model model, @PathVariable("id") int id) {
        Email email = iEmailService.selectById(id);
        model.addAttribute("email",email);

      List<String> languagesList = new ArrayList<>();
        languagesList.add("English");
        languagesList.add("Vietnamese");
        languagesList.add("Japanese");
        languagesList.add("Chinese");
      model.addAttribute("languagesList",languagesList);

      List<String> pageSize = new ArrayList<>();
        pageSize.add("5");
        pageSize.add("10");
        pageSize.add("15");
        pageSize.add("20");
        pageSize.add("25");
        pageSize.add("50");
        pageSize.add("100");
        model.addAttribute("pageSize",pageSize);
        return "/formEdit";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("email") Email email,@ModelAttribute("id") int id, RedirectAttributes redirectAttributes){
      iEmailService.update(email,id);
        return "redirect:/email";
    }
}
