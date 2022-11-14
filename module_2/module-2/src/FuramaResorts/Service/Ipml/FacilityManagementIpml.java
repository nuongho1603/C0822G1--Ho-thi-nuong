package FuramaResorts.Service.Ipml;

import FuramaResorts.Models.Facility;
import FuramaResorts.Models.Room;
import FuramaResorts.Models.Villa;
import FuramaResorts.Service.IFacilityManagementService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagementIpml implements IFacilityManagementService {
    LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display(){
        for (Map.Entry<Facility, Integer> map : linkedHashMap.entrySet()) {
                System.out.println(map.getKey().toString() + "," + map.getValue());
        }
    }

    @Override
    public void addRoom() {
        System.out.print("Nhap so lan use:");
        int soLan = Integer.parseInt(scanner.nextLine());
        linkedHashMap.put(infoRoom(),soLan);
    }

    @Override
    public void addVilla() {
        System.out.print("Nhap so lan use:");
        int soLan = Integer.parseInt(scanner.nextLine());
        linkedHashMap.put(infoVilla(), soLan);
    }

    @Override
    public void displayMaintenance() {
        for (Map.Entry<Facility, Integer> map : linkedHashMap.entrySet()) {
            if (map.getValue() >= 5) {
                System.out.println(map.getKey().toString() + "," + map.getValue());
            }
        }
    }

    public Villa infoVilla() {
        System.out.println("Ten dv: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Dien tich su dung: ");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("chi phi thue: ");
        int chiPhiThue = Integer.parseInt(scanner.nextLine());
        System.out.println("so luong toi da: ");
        int soLuongToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("kieu thue: ");
        String kieuThue = scanner.nextLine();
        System.out.println("");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        return villa;
    }


    public Room infoRoom() {
        System.out.println("Ten dv: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Dien tich su dung: ");
        double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("chi phi thue: ");
        int chiPhiThue = Integer.parseInt(scanner.nextLine());
        System.out.println("so luong toi da: ");
        int soLuongToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("kieu thue: ");
        String kieuThue = scanner.nextLine();
        System.out.println("dich vu free+ :");
        String dichVuFreeDiKem = scanner.nextLine();
        Room room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongToiDa, kieuThue, dichVuFreeDiKem);
        return room;

    }
}
