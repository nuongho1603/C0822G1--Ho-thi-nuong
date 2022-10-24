package Police.Models;

public class Oto extends TransportationManagement{
    private int numberOfSeats;
    private String vehicleType;

    public Oto() {
    }

    public Oto(String seaOfControl, String manufacturersName, int year, String owner, int numberOfSeats, String vehicleType) {
        super(seaOfControl, manufacturersName, year, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "numberOfSeats=" + numberOfSeats +
                ", vehicleType='" + vehicleType + '\'' +
                '}' +super.toString();
    }
}
