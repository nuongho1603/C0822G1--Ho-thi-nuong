package FuramaResort.Models;

public abstract class Facility {
   public String nameService;

   public double area;
   public double cost;
   public int amount;
   public String rentalType;

   public Facility() {
   }

   public Facility(String nameService, double area, double cost, int amount, String rentalType) {
      this.nameService = nameService;
      this.area = area;
      this.cost = cost;
      this.amount = amount;
      this.rentalType = rentalType;
   }

   public String getNameService() {
      return nameService;
   }

   public void setNameService(String nameService) {
      this.nameService = nameService;
   }

   public double getArea() {
      return area;
   }

   public void setArea(double area) {
      this.area = area;
   }

   public double getCost() {
      return cost;
   }

   public void setCost(double cost) {
      this.cost = cost;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   public String getRentalType() {
      return rentalType;
   }

   public void setRentalType(int day, int month,int year ) {
      this.rentalType = rentalType;
   }

   @Override
   public String toString() {
      return "FuramaResortService{" +
              "nameService='" + nameService + '\'' +
              ", area=" + area +
              ", cost=" + cost +
              ", amount=" + amount +
              ", rentalType='" + rentalType + '\'' +
              '}';
   }
}
