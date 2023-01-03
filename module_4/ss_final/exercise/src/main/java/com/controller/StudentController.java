package com.controller;

import com.model.Student;
import com.repository.IStudentRepository;
import com.service.IStudentService;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;
    @GetMapping("")
    public String showList(Model model){
        List<Student> studentList = iStudentService.findAll();
        model.addAttribute("studentList",studentList);
        return "list";
    }


}
