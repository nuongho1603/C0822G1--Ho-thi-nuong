package Codegym.Controller;

import Codegym.Service.IHocSinhService;
import Codegym.Service.Ipml.StudentsService;

import java.util.Scanner;

public class StudentsController {
   static Scanner scanner = new Scanner(System.in);
    IHocSinhService iHocSinhService=new StudentsService();
    public  void menuHocSinh(){
        int choice;
        do{
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới học sinh\n" +
                    "2. Xóa học sinh\n" +
                    "3. Xem danh sách học sinh\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:\n");
            System.out.print("Enter your choice: ");
            choice=Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    iHocSinhService.addHs();
                    break;
                case 2:
                    iHocSinhService.deleteHs();
                    break;
                case 3:
                    iHocSinhService.display();
                    break;
                case 4:
                    System.exit(0);
            }

        }while (true);
    }
}
