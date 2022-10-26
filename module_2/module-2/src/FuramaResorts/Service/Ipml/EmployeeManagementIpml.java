package FuramaResorts.Service.Ipml;

import FuramaResorts.Models.Employee;
import FuramaResorts.Service.IEmployeeManagementService;
import weekend_learning.interface_demo.Em;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementIpml implements IEmployeeManagementService {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @Override
    public void display() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }
    }

    public Employee info() {
        System.out.print("Mời bạn nhập tên nhân viên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh của nv: ");
        String ngayThangNamSinh = scanner.nextLine();
        System.out.println("Mời bạn nhập giới tính của nhân viên: ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Mời bạn nhập CMND: ");
        int CMND = Integer.parseInt(scanner.nextLine());
        System.out.println("mỜI bạn nhập sdt nv: ");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Mời bạn nhập mã nv: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập trình độ của nv: ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String viTri = scanner.nextLine();
        System.out.println("Nhập lương của nhân Viên: ");
        double luong = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(hoTen, ngayThangNamSinh, gioiTinh, CMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
        return employee;
    }

    @Override
    public void add() {
        Employee employee = this.info();
        employeeArrayList.add(employee);
        System.out.println("Chúc mừng bạn đã thêm thành công!");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id nhân viên bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getMaNhanVien() == id) {
                System.out.println("Ban co muon xoa ng co ten la " + employeeArrayList.get(i).getHoTen() + "hay khong?");
                System.out.println("Y: yes,N:No");
//
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    employeeArrayList.remove(employeeArrayList.get(i));
                    System.out.println("Da xoa thanh cong");
                } else {
                    display();
                }
            }
        }
    }

    public int search(int e) {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getMaNhanVien() == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit() {
//        int id = Integer.parseInt(scanner.nextLine());
//int index =

        int choice;
        System.out.println("1.Sửa tên" +
                "2.Sửa ngày tháng năm sinh." +
                "3.sửa giới tính." +
                "4.sửa CMND" +
                "5.SỬA SDT nhân viên." +
                "6.sửa email.." +
                "7.sửa mã nv" +
                "8.sửa trình độ" +
                "9.Sửa vị trí." +
                "10.Sửa lương của nv. ");
    }


}
