package Police.Service.Impl;

import Police.Controller.VehicleController;
import Police.Models.Truck;
import Police.Service.IDisplayService;

import java.util.ArrayList;

public class DisplayTruckIpml extends Truck implements IDisplayService {
    static ArrayList<Truck> truckArrayList = new ArrayList<>();
    Truck truck1 =new Truck("72a-11","hang1",2004,"Nuong","5 tấn.");
    Truck truck2 =new Truck("92a-12","hang2",1994,"Naa","3 tấn.");
    Truck truck3 =new Truck("10a-1996","hang3",1996,"Trung","2.3 tấn.");
    {
        truckArrayList.add(truck1);
        truckArrayList.add(truck2);
        truckArrayList.add(truck3);
    }
    @Override
    public void displayVehicle() {
    for(Truck trucks : truckArrayList){
        System.out.println(trucks.toString());
    }

//
//       System.out.println(truck1);
//        System.out.println("------------------------");
//        System.out.println(truck2);
//        System.out.println("------------------------");
//        System.out.println(truck3);
    }
}
