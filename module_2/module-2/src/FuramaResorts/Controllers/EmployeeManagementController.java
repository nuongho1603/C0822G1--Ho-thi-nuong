package FuramaResorts.Controllers;

import FuramaResorts.Service.Ipml.EmployeeManagementIpml;

import java.util.Scanner;

public class EmployeeManagementController {
    Scanner scanner = new Scanner(System.in);

    int choice;
    EmployeeManagementIpml iEmployeeManagementService = new EmployeeManagementIpml();

    public void menuEmployee() {
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");

            System.out.println("lựa chọn của bạn là: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iEmployeeManagementService.display();
                    break;
                case 2:
                    iEmployeeManagementService.add();
                    break;
                case 3:
                    iEmployeeManagementService.delete();
                    break;
                case 4:
                    edit();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }


    public void edit() {
        System.out.print("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        //boolean isCheck = false;

        int index;
        index = iEmployeeManagementService.search(id);
        if (index != -1) {
            //  isCheck = true;
            do {

                int choice;
                System.out.println("1.sửa mã nv\n" +
                        "2.Sửa ngày tháng năm sinh.\n" +
                        "3.sửa giới tính.\n" +
                        "4.sửa CMND.\n" +
                        "5.SỬA SDT nhân viên.\n" +
                        "6.sửa email.\n" +
                        "7.Sửa tên\n" +
                        "8.sửa trình độ \n" +
                        "9.Sửa vị trí.\n" +
                        "10.Sửa lương của nv.\n" +
                        "11.Quay lai.");

                System.out.print("enter choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Moi ban nhap lai ma nhan vien: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setMaNhanVien(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;
                    case 2:
                        System.out.print("Moi ban nhap lai ngay thang nam sinh: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setNgayThangNamSinh(scanner.nextLine());
                        System.out.println("Da edit thanh cong.Chuc mung ban.");

                        break;
                    case 3:
                        System.out.print("Moi ban nhap lai GIOI TINH: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setGioiTinh(scanner.nextLine());
                        System.out.print("Da edit thanh cong.Chuc mung ban.");
                        break;
                    case 4:
                        System.out.print("Moi ban nhap lai CMND: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setCMND(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;

                    case 5:
                        System.out.print("Moi ban nhap lai sdt: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;

                    case 6:
                        System.out.print("Moi ban nhap lai email: : ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setEmail(scanner.nextLine());
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;
                    case 7:
                        System.out.print("Moi ban nhap lai ten: ");
                        // employeeArrayList.set(index, employee);
                        EmployeeManagementIpml.employeeArrayList.get(index).setHoTen(scanner.nextLine());
                        //employeeArrayList.set(id,employee);
                        System.out.println("Da sua ten thanh cong.");
                        break;
                    case 8:
                        System.out.print("Moi ban nhap lai trinh do: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setTrinhDo(scanner.nextLine());
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;
                    case 9:
                        System.out.print("Moi ban nhap lai vi tri: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setViTri(scanner.nextLine());
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;
                    case 10:
                        System.out.print("Moi ban nhap lai luong: ");
                        EmployeeManagementIpml.employeeArrayList.get(index).setLuong(Double.parseDouble(scanner.nextLine()));
                        System.out.println("Da edit thanh cong.Chuc mung ban.");
                        break;
                    case 11:
                        return;

                }
                iEmployeeManagementService.writeFile();

            } while (true);

        } else {
            System.out.println("Khum tìm thấy mã nha! ");
        }
//         if (!isCheck ) {
//            System.out.println("Khum tìm thấy mã nha! ");
//        }
    }

}
