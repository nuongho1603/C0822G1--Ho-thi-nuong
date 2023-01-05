package com.model.dto;

import com.model.contract.ContractDetail;
import com.model.customer.Customer;
import com.model.employee.Employee;
import com.model.facility.Facility;

import java.util.List;

public class ContracDto {
    private int id;
    private String startDate;
    private String endDate;
    private double deposit;
    private Customer customer;
    private Facility facility;
    private Employee employee;
    List<ContractDetail> contractDetails;
    private double total;

    public ContracDto() {
    }

    public ContracDto(int id, String startDate, String endDate, double deposit, Customer customer, Facility facility, Employee employee, double total) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.customer = customer;
        this.facility = facility;
        this.employee = employee;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
