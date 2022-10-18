package FuramaResort.Models;

public class Employee extends Person{
     private String level;
     private String postion;
     private double wage;

     public Employee() {
     }

     public Employee(int id, String nickName, int dateOfBirth, boolean gender, int CMND, int phone, String email, String level, String postion, double wage) {
          super(id, nickName, dateOfBirth, gender, CMND, phone, email);
          this.level = level;
          this.postion = postion;
          this.wage = wage;
     }

     public String getLevel() {
          return level;
     }

     public void setLevel(String level) {
          this.level = level;
     }

     public String getPostion() {
          return postion;
     }

     public void setPostion(String postion) {
          this.postion = postion;
     }


     

     public double getWage() {
          return wage;
     }

     public void setWage(double wage) {
          this.wage = wage;
     }







}
