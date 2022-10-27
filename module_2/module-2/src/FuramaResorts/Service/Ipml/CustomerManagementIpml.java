package FuramaResorts.Service.Ipml;

import FuramaResorts.Models.Customer;
import FuramaResorts.Service.ICustomerManagementService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagementIpml implements ICustomerManagementService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    @Override
    public void displayCustomer() {
        for (Customer customer : customerArrayList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public Customer addCustomer() {
        Customer customers = this.info();
        customerArrayList.add(customers);
        System.out.println("Da add thanh cong!");
        return customers;
    }


    public Customer info(){
        System.out.print("HỌ và tên khach hàng: ");
        String hoTen=scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh: ");
        String ngayThangNamSinh = scanner.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Số CMND: ");
        int CMND =Integer.parseInt(scanner.nextLine());
        System.out.print("SDT: ");
        int soDienThoai =Integer.parseInt(scanner.nextLine());
        System.out.print("email: ");
        String email= scanner.nextLine();
        System.out.print("Nhập mã khách hàng: ");
        int maKhachHang = Integer.parseInt(scanner.nextLine());
        System.out.print("Loai khach: ");
        String loaiKhach = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(hoTen,ngayThangNamSinh,gioiTinh,CMND,soDienThoai,email,maKhachHang,loaiKhach,diaChi);

        return customer;
    }


    @Override
    public void editCustomer() {

    }
}
