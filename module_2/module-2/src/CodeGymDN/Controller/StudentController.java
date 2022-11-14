package CodeGymDN.Controller;

import CodeGymDN.Service.IStudentService;
import CodeGymDN.Service.Impl.StudentImpl;

import java.util.Scanner;

public class StudentController {
    public void menuStudent() {
        IStudentService iStudentService = new StudentImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" --CHƯƠNG TRÌNH QUẢN LÝ HOC SINH –--" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                    break;
                case 3:
                    iStudentService.displayStudent();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }


}
