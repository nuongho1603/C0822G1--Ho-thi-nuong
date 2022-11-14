package FuramaResorts.Controllers;

import FuramaResorts.Service.Ipml.CustomerManagementIpml;
import FuramaResorts.Service.Ipml.EmployeeManagementIpml;

import java.util.Scanner;

public class CustomerManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
    CustomerManagementIpml iCustomerManagementService = new CustomerManagementIpml();

    public void menuCustomer() {
        do {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iCustomerManagementService.displayCustomer();
                    break;
                case 2:
                    iCustomerManagementService.addCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    public void editCustomer() {

        System.out.print("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < CustomerManagementIpml.customerLinkedList.size(); i++) {
            if (id == CustomerManagementIpml.customerLinkedList.get(i).getMaKhachHang()) {
                int index;
                int choice;
                index = iCustomerManagementService.search(id);
                if (index != -1) {
                    do {
                        System.out.println("1.sửa mã nv\n" +
                                "  2.Sửa ngày tháng năm sinh.\n" +
                                " 3.sửa giới tính.\n" +
                                " 4.sửa CMND.\n" +
                                "5.SỬA SDT khách hàng.\n" +
                                " 6.sửa email.\n" +
                                " 7.Sửa tên.\n" +
                                " 8.Sửa loại khách \n" +
                                "9.Sửa vị trí.\n" +
                                "10.Quay lai." );
                        System.out.print("Lựa chọn của bạn là: ");
                        choice= Integer.parseInt(scanner.nextLine());

                        switch (choice){
                            case 1:
                                System.out.print("Mời bạn nhập lại mã khách hàng: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setMaKhachHang(Integer.parseInt(scanner.nextLine()));
                                System.out.println("");
                                break;
                            case 2:
                                System.out.print("Nhập lai ngay thang nam sinh: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setNgayThangNamSinh(scanner.nextLine());
                                System.out.println("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 3:
                                System.out.print("Nhập lại giới tính: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setGioiTinh(scanner.nextLine());
                                System.out.print("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 4:
                                System.out.print("Nhập lại CMND: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setCMND(Integer.parseInt(scanner.nextLine()));
                                System.out.println("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 5:

                                System.out.print("Nhập lại sdt: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                                System.out.println("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 6:
                                System.out.print("Nhập lại email: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setEmail(scanner.nextLine());
                                System.out.println("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 7:
                                System.out.print("Tên sửa thành: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setHoTen(scanner.nextLine());
                                System.out.println("Da sua ten thanh cong.");
                                break;
                            case 8:
                                System.out.print("Moi ban nhap lai loại khách: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setLoaiKhach(scanner.nextLine());
                                System.out.print("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 9:
                                System.out.print("Nhập lại địa chỉ: ");
                                CustomerManagementIpml.customerLinkedList.get(i).setDiaChi(scanner.nextLine());
                                System.out.print("Da edit thanh cong.Chuc mung ban.");
                                break;
                            case 10:
                                return;
                        }
                    } while (true);

                }
            }
        }
    }

}
