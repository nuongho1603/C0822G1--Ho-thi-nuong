package Police.Service.Impl;

import Police.Controller.DisplayVehicleController;
import Police.Models.Truck;
import Police.Service.IAddTruckService;

import java.util.ArrayList;
import java.util.Scanner;

import static Police.Service.Impl.DisplayTruckIpml.truckArrayList;

public class AddTruckIpml extends DisplayTruckIpml implements IAddTruckService {
//    ArrayList<Truck> truckArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    @Override
    public void addTruckNew() {
        Truck truck1 = new Truck();
        System.out.print("Biển kiểm soát: ");
        truck1.setSeaOfControl(scanner.nextLine());

        System.out.print("Hãng sản xuất: ");
        truck1.setManufacturersName(scanner.nextLine());

        System.out.print("Năm sản xuất:");
        truck1.setYear(Integer.parseInt(scanner.nextLine()));

        System.out.print("Chủ sở hữu: ");
        truck1.setOwner(scanner.nextLine());

        System.out.print("Tải trọng xe tải : ");
        truck1.setTonnage(scanner.nextLine());

        truckArrayList.add(truck1);
        System.out.println(truckArrayList.toString());
    }




}
