package com.model.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto implements Validator {
    private int id;
    private String firstName;
    @Pattern(regexp = "[a-zA-Z]+", message = "Kh chứ ký tự số ạ! ")
    @Size(min = 5, max = 25, message = "Đã quá limited chữ rồi bạn oi!")
    @NotBlank(message = "Kh được để trống đâu!! ")
    private String lastName;
    @Pattern(regexp = "0[0-9]{10}", message = "abc")
    private String phone;

    @Min(value = 18, message = "Bạn không đủ tuổi đăng kí!")
    private String age;
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "abc")
    private String email;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto user = (UserDto) target;

        char x = user.getFirstName().charAt(0);
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
