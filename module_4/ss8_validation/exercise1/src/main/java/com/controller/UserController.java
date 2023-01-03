package com.controller;

import com.model.User;
import com.model.dto.UserDto;
import com.repository.IUserRepository;
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

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserRepository iUserRepository;

    @RequestMapping("")
    public String show(Model model) {
        List<User> userList = iUserRepository.findAll();
        model.addAttribute("userList", userList);
        return "/result";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "index";
    }

    @PostMapping("/save")
    public String create(Model model, @Validated @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult) {
       new UserDto().validate(userDto,bindingResult);

        if (bindingResult.hasErrors()) {
            return "index";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserRepository.save(user);
        model.addAttribute("mess"," Đăng ký thành công! ");
        return "result";
    }
}
