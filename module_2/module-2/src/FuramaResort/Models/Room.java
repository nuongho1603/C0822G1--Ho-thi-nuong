package FuramaResort.Models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double area, double cost, int amount, String rentalType, String freeService) {
        super(nameService, area, cost, amount, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}' + super.toString();
    }
}
