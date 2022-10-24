package Codegym.Service.Ipml;

import Codegym.Models.Students;
import Codegym.Service.IHocSinhService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsService implements IHocSinhService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Students> hocSinhArrayList = new ArrayList<>();
    Students hocSinh1=new Students(1,"Trung","Nu","11/12/1996","c0722G1",27);
    Students hocSinh2=new Students(2,"Trung1","Nam","11/12/1996","c0722G1",27);
    Students hocSinh3=new Students(3,"Trung2","Nam","11/12/1996","c0722G1",27);
    {
        hocSinhArrayList.add(hocSinh1);
        hocSinhArrayList.add(hocSinh2);
        hocSinhArrayList.add(hocSinh3);
    }

    @Override
    public void addHs() {
        Students students = this.info();
        hocSinhArrayList.add(students);
        System.out.println("them thanh cong.");

    }

    @Override
    public void deleteHs() {
        System.out.println("Nhap vao ma hs:");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isCheck=false;
        for (int i = 0; i < hocSinhArrayList.size(); i++) {
            if (hocSinhArrayList.get(i).getId() == id) {
                System.out.println("Ban muon xoa hsinh nay khong?Nhap\n Y:Yes\nN:No");
                String answer = scanner.nextLine();
                isCheck=true;
                if (answer.equals("Y")) {
                    hocSinhArrayList.remove(i);
                    System.out.println("Xoa thanh cong");
                    break;
                }

            }
        }
        if (!isCheck){
            System.out.println("khong tim thay ma hs");
        }

    }

    @Override
    public void display() {
//        for (int i = 0; i <hocSinhArrayList.size() ; i++) {
//            System.out.println(hocSinhArrayList.get(i).toString());
//        }

        for (Students hocSinh : hocSinhArrayList){
            System.out.println(hocSinh.toString());
        }
    }

    public Students info () {
            System.out.print("Moi ban nhap ma sv:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Moi ban nhap ten sv: ");
            String name = scanner.nextLine();
            System.out.print("Moi ban nhap gioi tinh:");
            String gender = scanner.nextLine();
            System.out.println("Moi ban nhap ngay thang nam sinh:");
            String day = scanner.nextLine();
            System.out.print("Moi ban nhap lop: ");
            String clasS = scanner.nextLine();
            System.out.print("Moi ban nhap diem : ");
            int score = Integer.parseInt(scanner.nextLine());
            Students students  = new Students(id, name, gender, day, clasS, score);
            return students;
        }
    }
