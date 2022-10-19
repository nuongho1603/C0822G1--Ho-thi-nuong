package FuramaResort.Models;

import java.io.StringReader;

public abstract class Person {
    protected int id;
    protected String nickName;
    protected int dateOfBirth;
    protected boolean gender;
    protected int CMND;
    protected int phone;
    protected String email;

    public Person() {
    }

    public Person(int id, String nickName, int dateOfBirth, boolean gender, int CMND, int phone, String email) {
        this.id = id;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.CMND = CMND;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", CMND=" + CMND +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
