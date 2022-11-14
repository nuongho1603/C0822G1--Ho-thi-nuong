package CodeGymDN.Controller;

import CodeGymDN.Service.IStudentService;
import CodeGymDN.Service.Impl.StudentImpl;

import java.util.Scanner;

public class CodeGymController {
    public  void menuCodeGym() {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Management Student" +
                    "2.Management teachers" +
                    "3.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
