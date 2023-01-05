package com.service.employee;

import com.model.employee.Employee;
import com.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;
    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }
}
