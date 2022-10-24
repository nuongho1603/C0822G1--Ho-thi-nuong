package Police.Controller;

import Police.Service.Impl.AddMotoIpml;
import Police.Service.Impl.AddOtoIpml;
import Police.Service.Impl.AddTruckIpml;

import java.util.Scanner;

public class VehicleController {
    Scanner scanner = new Scanner(System.in);

    public void add() {
        AddTruckIpml trucks = new AddTruckIpml();
        AddOtoIpml otos = new AddOtoIpml();
        AddMotoIpml motos = new AddMotoIpml();
        int number;
        do {
            System.out.println("Bạn muốn thêm ?\n " +
                    "1. Thêm xe tải,\n" +
                    " 2. Thêm ôtô, \n" +
                    "3. Thêm  xe máy.\n" +
                    "4.Thoats\n" +
                    "5.Quay lai menu chinh.\n ");
            System.out.print("Mời bạn nhập phương tiện muốn thêm: ");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    trucks.addTruckNew();
                    break;
                case 2:
                    otos.addOtoNew();
                    break;
                case 3:
                    motos.addMotoNew();
                    break;
                case 4:
                    System.exit(0);
                case 5:
                   return;
            }
        } while (true);
    }
}
