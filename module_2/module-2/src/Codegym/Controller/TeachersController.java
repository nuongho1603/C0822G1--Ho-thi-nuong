package Codegym.Controller;

import Codegym.Service.IGiaoVienService;
import Codegym.Service.Ipml.TeachersService;

import java.util.Scanner;

public class TeachersController {

    public static void menuGvien(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            IGiaoVienService iGiaoVienService = new TeachersService();
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ GIÁO VIÊN--–\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới GV \n" +
                    "2. Xóa GV \n" +
                    "3. Xem danh sách GV\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:\n");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iGiaoVienService.addGv();
                    break;
                case 2:
                    iGiaoVienService.delete();
                    break;
                case 3:
                    iGiaoVienService.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);
    }
}
