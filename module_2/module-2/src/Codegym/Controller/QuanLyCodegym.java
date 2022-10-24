package Codegym.Controller;

import java.util.Scanner;

public class QuanLyCodegym {
    Scanner scanner = new Scanner(System.in);
    StudentsController hocSinh = new StudentsController();

    int choice;
    public void quanLyCodeGym(){
        do{
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ GIÁO VIÊN VÀ SINH VIÊN –\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Quản lí sinh viên. \n" +
                    "2.Quản lí giáo viên \n" +
                    "3.Thoat. " +
                    "Chọn chức năng:\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    hocSinh.menuHocSinh();
                    break;
                case 2:
                    TeachersController.menuGvien();
                    break;
                case 3:
                    System.exit(0);


            }

        } while (true);

    }
}
