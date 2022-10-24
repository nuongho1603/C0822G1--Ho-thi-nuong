package Codegym.Service.Ipml;

import Codegym.Models.Students;
import Codegym.Models.Teachers;
import Codegym.Service.IGiaoVienService;

import java.util.ArrayList;
import java.util.Scanner;

public class TeachersService implements IGiaoVienService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Teachers> teachersArrayList = new ArrayList<>();


    static {
        Teachers teacher1 = new Teachers(1, "Nga", "Nam", "../../2004", "English");
        Teachers teacher2 = new Teachers(2, "Nga1", "Nam", "../../2004", "ART");
        Teachers teacher3 = new Teachers(3, "Nga2", "Nam", "../../2004", "MATH");

        teachersArrayList.add(teacher1);
        teachersArrayList.add(teacher2);
        teachersArrayList.add(teacher3);
    }
//    @Override
//    public void addGv() {
//        Teachers teachers1 = new Teachers();
//        System.out.print("Moi ban nhap ma gv:");
//        teachers1.setId(Integer.parseInt(scanner.nextLine()));
//        System.out.print("Moi ban nhap ten gvien: ");
//        teachers1.setName(scanner.nextLine());
//        System.out.println("Moi ban nhap ngay thang nam sinh:");
//        teachers1.setDay(scanner.nextLine());
//        System.out.print("Moi ban nhap gioi tinh:");
//        teachers1.setGender(scanner.nextLine());
//        System.out.print("Moi ban nhap chuyen mon: ");
//        teachers1.setSpecialize(scanner.nextLine());
//
//        teachersArrayList.add(teachers1);
//        System.out.println(teachersArrayList);

    public Teachers info() {
        System.out.print("Moi ban nhap ma sv:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Moi ban nhap ten sv: ");
        String name = scanner.nextLine();
        System.out.print("Moi ban nhap gioi tinh:");
        String gender = scanner.nextLine();
        System.out.println("Moi ban nhap ngay thang nam sinh:");
        String day = scanner.nextLine();
        System.out.print("Moi ban nhap chuyen mon: ");
        String specialize = scanner.nextLine();
        Teachers teachers = new Teachers(id, name, gender, day, specialize);
        return teachers;
    }

    @Override
    public void addGv() {
        Teachers teachers = this.info();
        teachersArrayList.add(teachers);
        System.out.println("Them thanh cong. ");
    }

    @Override
    public void delete() {
        System.out.print("Moi ban nhap id muon xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;
        for (int i = 0; i < teachersArrayList.size(); i++) {
            if (teachersArrayList.get(i).getId() == id) {
                System.out.println("Ban muon xoa hsinh nay khong?Nhap\n Y:Yes\nN:No");
                String answer = scanner.nextLine();
                isCheck = true;
                if (answer.equals("Y")) {
                    teachersArrayList.remove(i);
                    System.out.println("Delete thanh cong");
                    break;
                }
            }
        }
        if (!isCheck) {
            System.out.println("KHong tim thay ma gv!");
        }
    }


    @Override
    public void display() {
        for (Teachers giaoVien : teachersArrayList) {
            System.out.println(giaoVien.toString());
        }
    }


}

