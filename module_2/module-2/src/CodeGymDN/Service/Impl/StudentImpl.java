package CodeGymDN.Service.Impl;

import CodeGymDN.Service.IStudentService;
import CodeGymDN.Util.ReadFile;
import CodeGymDN.Util.Regex;
import CodeGymDN.Util.WriteFile;
import CodeGymDN.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    final String PATH_STUDENT = "module-2\\src\\CodeGymDN\\Data\\students.csv";

    public void readFile() {
        studentList = ReadFile.readFile(PATH_STUDENT);
    }

    public void writeFile() {
        WriteFile.writeFileStudent(PATH_STUDENT,studentList);
    }

    public Student infoStudent() {
        System.out.println("id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("ten: ");
        String name = scanner.nextLine();
        System.out.println("date:");
        String date = scanner.nextLine();
        System.out.println("gender: ");
        String gender = scanner.nextLine();
        System.out.println("Classer: ");
        String classer = scanner.nextLine();
        System.out.println("Score: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, date, gender, classer, score);
        return student;
    }

    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        studentList.add(student);
        System.out.println("Da add thanh cong.");
        writeFile();
    } 

    @Override
    public void deleteStudent() {
        readFile();
        System.out.println("Enter ID: ");
        String id = Regex.regexStudent();
        boolean check = false;
            for (int i = 0; i < studentList.size(); i++) {
                if ((Integer.parseInt(id)) == studentList.get(i).getId()) {
                    check = true;
                    System.out.println("Ban muon xoa sinh vien co id = " + studentList.get(i) + "HONG ?" +
                            "Y:yes ,N:No");
                    String answer = scanner.nextLine();
                    if (answer.equals("Y")) {
                        studentList.remove(studentList.get(i) );
                        System.out.println("Da xoa thanh cong.");
                        writeFile();
                        break;
                    }
                }
            }
            if (!check){
                System.out.println("Khong tim thay ma! ");
            }
    }

    @Override
    public void displayStudent() {
        readFile();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
