package Police.Service.Impl;

import Police.Controller.DisplayVehicleController;
import Police.Models.Motorcycle;
import Police.Service.IAddMotoService;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMotoIpml extends DisplayMotoIpml implements IAddMotoService {
//    ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addMotoNew() {
        Motorcycle moto1 = new Motorcycle();
        System.out.print("Biển kiểm soát: ");
        moto1.setSeaOfControl(scanner.nextLine());


        System.out.print("Hãng sản xuất: ");
        moto1.setManufacturersName(scanner.nextLine());

        System.out.print("Năm sản xuất:");
        moto1.setYear(Integer.parseInt(scanner.nextLine()));

        System.out.print("Chủ sở hữu: ");
        moto1.setOwner(scanner.nextLine());

        System.out.print("Công suất  : ");
        moto1.setWattage(scanner.nextLine());


        motorcycleArrayList.add(moto1);
        System.out.println(motorcycleArrayList);

    }
}
