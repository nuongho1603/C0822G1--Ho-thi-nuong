package Police.Models;

public class Truck extends TransportationManagement{
    private String Tonnage;

    public Truck() {
    }

    public Truck(String seaOfControl, String manufacturersName, int year, String owner, String tonnage) {
        super(seaOfControl, manufacturersName, year, owner);
        Tonnage = tonnage;
    }

    public String getTonnage() {
        return Tonnage;
    }

    public void setTonnage(String tonnage) {
        Tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Tonnage=" + Tonnage +
                '}'+super.toString();
    }
}
