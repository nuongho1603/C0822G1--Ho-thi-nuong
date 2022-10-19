package FuramaResort.Service.impl;

import FuramaResort.Models.Employee;
import FuramaResort.Service.IEmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        Employee employee1 = new Employee();
        System.out.println("Nhap ten: ");
        employee1.setNickName(scanner.nextLine());

    }

    @Override
    public void display() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }
    }
}
