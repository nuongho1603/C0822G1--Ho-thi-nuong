package Police.Models;

public class Motorcycle extends TransportationManagement{
private String Wattage;

    public Motorcycle() {
    }

    public Motorcycle(String seaOfControl, String manufacturersName, int year, String owner, String wattage) {
        super(seaOfControl, manufacturersName, year, owner);
        Wattage = wattage;
    }

    public String getWattage() {
        return Wattage;
    }

    public void setWattage(String wattage) {
        Wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Wattage=" + Wattage +
                '}' +super.toString();
    }
}
