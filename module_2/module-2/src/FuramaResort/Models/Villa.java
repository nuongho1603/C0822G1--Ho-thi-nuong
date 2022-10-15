package FuramaResort.Models;

import FuramaResort.Models.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String nameService, double area, double cost, int amount, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(nameService, area, cost, amount, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}' + super.toString();
    }
}
