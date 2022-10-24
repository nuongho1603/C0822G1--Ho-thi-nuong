package Police.Controller;

import java.util.Scanner;

public class ProgramManagementCotroller {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        VehicleController vehicleController = new VehicleController();
        DisplayVehicleController displayVehicle = new DisplayVehicleController();
        int choice;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleController.add();
                    break;
                case 2:
                 displayVehicle.displayVehicle();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
