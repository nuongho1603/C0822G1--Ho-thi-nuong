package Codegym.Models;

public class Person {
    private int id;
    private String name;
    private String gender;
    private String day;

    public Person() {
    }

    public Person(int id, String name, String gender, String day) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.day = day;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", day='" + day + '\'' +
                '}';
    }
}
