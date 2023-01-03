package com.model.dto;

import com.model.customer.Customer;
import com.model.customer.CustomerType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;


public class CustomerDto implements Validator {
    private int id;
    @Pattern(regexp = "[a-zA-Z ]+",message = "Không chứa ký tự đặc biệt và số! ")
    private String name;
    private String dateOfBirth;
    private String gender;
    @Pattern(regexp = "[0-9]{9,12}",message = "Chưa đúng định dạng ạ! ")
    private String idCard;
    @Pattern(regexp = "(090|091|(84)+)[0-9]{7}",message = "Chưa đúng định dạng ạ! ")
    private String phoneNumber;
    @Pattern(regexp = "[\\w]+[@][\\w]+.[\\w]+",message = "Vui lòng gõ đúng định dạng!")
    private String email;
    private String address;
    private CustomerType customerType;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customer = (CustomerDto) target;

        char x = customer.getName().charAt(0);
        if (x < 'A' || x > 'Z') {
            errors.rejectValue("firstName", "firstName", "ký tự đầu tiên phải viết hoa nha! ");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
