package Police.Controller;

import Police.Service.Impl.DisplayMotoIpml;
import Police.Service.Impl.DisplayOtoIpml;
import Police.Service.Impl.DisplayTruckIpml;

import java.util.Scanner;

public class DisplayVehicleController {
    Scanner scanner = new Scanner(System.in);
    int choices;
    DisplayTruckIpml displayTrucks = new DisplayTruckIpml();
    DisplayMotoIpml displayMotos = new DisplayMotoIpml();
    DisplayOtoIpml displayOtos = new DisplayOtoIpml();

    public void displayVehicle() {
        do {
            System.out.println("1. Hiện thị xe tải.\n" +
                    "2. Hiện thị ôtô. \n" +
                    "3. Hiện  xe máy.\n" +
                    "4.Thoats\n" +
                    "5.Quay lai page chinh.\n");
            System.out.print("Moi ban nhap lua chon: ");
            choices = Integer.parseInt(scanner.nextLine());
            switch (choices) {
                case 1:
                    displayTrucks.displayVehicle();
                    break;
                case 2:
                    displayOtos.displayVehicle();
                    break;
                case 3:
                    displayMotos.displayVehicle();
                    break;
                case 4:
                    System.exit(0);
                case 5:
                    return;
            }
        } while (true);
    }

}
