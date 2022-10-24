package Police.Service.Impl;

import Police.Controller.DisplayVehicleController;
import Police.Models.Oto;
import Police.Service.IAddOtoService;

import java.util.ArrayList;
import java.util.Scanner;

import static Police.Service.Impl.DisplayOtoIpml.otoArrayList;

public class AddOtoIpml extends DisplayOtoIpml implements IAddOtoService {
//    ArrayList<Oto> otoArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addOtoNew() {
        Oto oto1 = new Oto();
        System.out.print("Biển kiểm soát: ");
        oto1.setSeaOfControl(scanner.nextLine());


        System.out.print("Hãng sản xuất: ");
        oto1.setManufacturersName(scanner.nextLine());

        System.out.print("Năm sản xuất:");
        oto1.setYear(Integer.parseInt(scanner.nextLine()));

        System.out.print("Chủ sở hữu: ");
        oto1.setOwner(scanner.nextLine());

        System.out.print("Số chỗ ngồi : ");
        oto1.setNumberOfSeats(Integer.parseInt(scanner.nextLine()));

        System.out.print("Kiểu xe : ");
        oto1.setVehicleType(scanner.nextLine());

        otoArrayList.add(oto1);
        System.out.println(otoArrayList);

    }
}
