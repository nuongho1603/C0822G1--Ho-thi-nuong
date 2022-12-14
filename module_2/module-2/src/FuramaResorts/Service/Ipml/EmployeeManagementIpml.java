package FuramaResorts.Service.Ipml;

import FuramaResorts.Models.Employee;
import FuramaResorts.Service.IEmployeeManagementService;
import FuramaResorts.Util.REgex;
import FuramaResorts.Util.ReadFile;
import FuramaResorts.Util.WriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementIpml implements IEmployeeManagementService {
    public static final String PATH_EMPLOYEE = "module-2\\src\\FuramaResorts\\Data\\employee.data";

    Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeArrayList = new ArrayList<>();

    //WriteFile writeFile=new WriteFile();
//ReadFile readFile = new ReadFile();
    private void readFile() {
        employeeArrayList = ReadFile.readFileEmployee(PATH_EMPLOYEE);
    }

//    public void writeFile() {
//        List<String> employeeStr = new ArrayList<>();
//
//        final String COMMA = ",";
//        final StringBuilder sb = new StringBuilder();
//
//        for (Employee employee : employeeArrayList) {
//            sb.append(employee.getHoTen())
//                    .append(COMMA)
//                    .append(employee.getNgayThangNamSinh())
//                    .append(COMMA)
//                    .append(employee.getGioiTinh())
//                    .append(COMMA)
//                    .append(employee.getCMND())
//                    .append(COMMA)
//                    .append(employee.getSoDienThoai())
//                    .append(COMMA)
//                    .append(employee.getEmail())
//                    .append(COMMA)
//                    .append(employee.getMaNhanVien())
//                    .append(COMMA).append(employee.getTrinhDo())
//                    .append(COMMA)
//                    .append(employee.getViTri())
//                    .append(COMMA)
//                    .append(employee.getLuong())
//                    .append("\n");
//
//            employeeStr.add(sb.toString());
//        }
//
//        WriteFile.writeFileEmployee(PATH_EMPLOYEE, employeeStr);
//    }

//    public void writeFile() {
//       List<String> strings = new ArrayList<>();
//        //final StringBuilder sb = new StringBuilder();
//
//        final String COMMA = ",";
//        String line;
//        for (Employee employees : employeeArrayList) {
//           line = employees.getHoTen() + COMMA
//                    + employees.getNgayThangNamSinh() + COMMA
//                    + employees.getGioiTinh() + COMMA
//                    + employees.getCMND() + COMMA
//                    + employees.getSoDienThoai() + COMMA
//                    + employees.getEmail() + COMMA
//                   +employees.getMaNhanVien() + COMMA
//                    + employees.getTrinhDo() + COMMA
//                    + employees.getViTri() + COMMA
//                    + employees.getLuong();
//           strings.add(line);
//
//
//        }
//        WriteFile.writeFileEmployee(PATH_EMPLOYEE,strings);
//
//    }

    public void writeFile() {
        WriteFile.writeFileEmployee(PATH_EMPLOYEE, employeeArrayList);
    }

    @Override
    public void display() {
        readFile();
        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());

        }
    }

    public Employee info() {
        System.out.print("M???i b???n nh???p t??n nh??n vi??n: ");
        String hoTen = REgex.regexString();
        System.out.println("M???i b???n nh???p ng??y th??ng n??m sinh c???a nv: ");
        String ngayThangNamSinh = scanner.nextLine();
        System.out.println("M???i b???n nh???p gi???i t??nh c???a nh??n vi??n: ");
        String gioiTinh = scanner.nextLine();
        System.out.println("M???i b???n nh???p CMND: ");
        int CMND = Integer.parseInt(scanner.nextLine());
        System.out.println("m???I b???n nh???p sdt nv: ");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("M???i b???n nh???p email: ");
        String email = scanner.nextLine();
        System.out.println("M???i b???n nh???p m?? nv: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("M???i b???n nh???p tr??nh ????? c???a nv: ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nh???p v??? tr??: ");
        String viTri = scanner.nextLine();
        System.out.println("Nh???p l????ng c???a nh??n Vi??n: ");
        double luong = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(hoTen, ngayThangNamSinh, gioiTinh, CMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);

        return employee;
    }

    @Override
    public void add() {
        Employee employee = this.info();
        employeeArrayList.add(employee);
        System.out.println("Ch??c m???ng b???n ???? th??m th??nh c??ng!");
        writeFile();
    }

    @Override
    public void delete() {
        readFile();
        String regex = "\\d+";
        String id;
        do {
            System.out.println("Nh???p id nh??n vi??n b???n mu???n x??a: ");
            id = scanner.nextLine();
        } while (!id.matches(regex));

        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getMaNhanVien() == (Integer.parseInt(id))) {
                System.out.println("Ban co muon xoa ng co ten la " + employeeArrayList.get(i).getHoTen() + "hay khong?");
                System.out.println("Y: yes,N:No");
//
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    employeeArrayList.remove(employeeArrayList.get(i));
                    System.out.println("Da xoa thanh cong");
                    writeFile();
                } else {
                    display();
                }
            }
        }
    }

//    @Override
//    public void edit() {
//        System.out.print("Nh???p id : ");
//        int id = Integer.parseInt(scanner.nextLine());
//      //  boolean isCheck = false;
//        for (int i = 0; i < employeeArrayList.size(); i++) {
//
//            if (employeeArrayList.get(i).getMaNhanVien() == id){
//              //  isCheck = true;
//            }
//    }

    public int search(int e) {
        readFile();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getMaNhanVien() == e) {
                return i;
            }
        }
        return -1;
    }


}