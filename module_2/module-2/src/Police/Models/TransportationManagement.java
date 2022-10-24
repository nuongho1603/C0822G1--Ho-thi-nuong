package Police.Models;

public abstract class TransportationManagement {
    private String seaOfControl;
    private String ManufacturersName;
    private int year;
    private String owner;

    public TransportationManagement() {
    }

    public TransportationManagement(String seaOfControl, String manufacturersName, int year, String owner) {
        this.seaOfControl = seaOfControl;
        ManufacturersName = manufacturersName;
        this.year = year;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturersName() {
        return ManufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        ManufacturersName = manufacturersName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "TransportationManagement{" +
                "seaOfControl='" + seaOfControl + '\'' +
                ", ManufacturersName='" + ManufacturersName + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                '}';
    }
}
