package com.service;

import com.model.Student;

import java.util.List;

public interface IStudentService {
List<Student> findAll();
void save(Student student);
}
