package com.controller;


import com.model.MyBlog;
import com.service.IBlogService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @RequestMapping("")
    public String show(Model model) {
        List<MyBlog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        return "/blog/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        Optional<MyBlog> blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("blog") MyBlog blog) {
        iBlogService.save(blog);
        List<MyBlog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", "Edit blog thành công! ");
        return "/blog/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new MyBlog());
        return "/blog/create";
    }

    @PostMapping("/save")
    public String create(Model model, @ModelAttribute("blog") MyBlog blog) {
        iBlogService.save(blog);
        List<MyBlog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", "Add product thành công! ");
        return "/blog/list";
    }

    @PostMapping("/delete")
    public String delete(Model model, @RequestParam("deleteId") int id) {
        iBlogService.deleteById(id);
        List<MyBlog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", "Delete product thành công! ");
        return "/blog/list";
    }
}
