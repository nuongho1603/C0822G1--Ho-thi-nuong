package com.controller;

import com.model.Blog;
import com.model.Category;
import com.service.IBlogService;
import com.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blogs")
@CrossOrigin("*")
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;


    @GetMapping("")
    public ResponseEntity<List<Blog>> getListBlog() {
        List<Blog> blogList = iBlogService.findAll();

        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("category")
    public ResponseEntity<List<Category>> getListCategory() {
        List<Category> categoryList = iCategoryService.findAll();

        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }


    @PostMapping("")
    public ResponseEntity<?> add(@RequestBody Blog blog) {
        iBlogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<?> edit(@RequestBody Blog blog) {
        iBlogService.save(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("blog/{title}")
    public ResponseEntity<?> getListTitle(@PathVariable("title") String title) {
       List<Blog> blog = iBlogService.findBlogByTitle(title);
       if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
//    @GetMapping("blog")
//    public ResponseEntity<?> getListTitle(@RequestParam("title") String title, @RequestParam("id") int id) {
//       List<Blog> blog = iBlogService.findBlogByTitle(title,id);
//       if (blog == null) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(blog, HttpStatus.OK);
//    }
}
