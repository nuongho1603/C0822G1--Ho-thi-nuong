package com.controller;


import com.model.Category;
import com.model.MyBlog;
import com.service.IBlogService;
import com.service.ICategoryService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @RequestMapping("")
    public String show(Model model, @RequestParam(name = "search", defaultValue = "") String title, @PageableDefault(value = 2) Pageable pageable) {
        Page<MyBlog> blogList = iBlogService.findByTitleContaining(title, pageable);
        model.addAttribute("blogList", blogList);
        return "/blog/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(Model model, @PathVariable("id") int id) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        Optional<MyBlog> blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/edit";
    }

    @PostMapping("/edit")
    public String edit(Model model, @ModelAttribute("blog") MyBlog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        List<MyBlog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", "Edit blog thành công! ");
        return "redirect:/blog";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("blog", new MyBlog());
        model.addAttribute("categoryList", categoryList);
        return "/blog/create";
    }

    @PostMapping("/save")
    public String create(Model model, @ModelAttribute("blog") MyBlog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        List<MyBlog> blogList = iBlogService.findAll();
        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", "Add product thành công! ");
        return "redirect:/blog";
    }

    @PostMapping("/delete")
    public String delete(Model model, @RequestParam("deleteId") int id, RedirectAttributes redirectAttributes) {
        iBlogService.deleteById(id);
//        List<MyBlog> blogList = iBlogService.findAll();
//        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", "Delete product thành công! ");
        return "redirect:/blog";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam(name = "search", defaultValue = "") String title, @PageableDefault(value = 2) Pageable pageable, RedirectAttributes redirectAttributes) {
        Page<MyBlog> products = iBlogService.findByTitleContaining(title, pageable);
        model.addAttribute("productList", products);
        model.addAttribute("search", title);
        return "redirect:/blog";
    }
}
