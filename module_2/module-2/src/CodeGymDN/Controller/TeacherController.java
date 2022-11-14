package CodeGymDN.Controller;

import CodeGymDN.Service.ITeachersService;
import CodeGymDN.Service.Impl.TeachersImpl;

import java.util.Scanner;

public class TeacherController {
    public void menuTeacher() {
        ITeachersService iTeachersService = new TeachersImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" --CHƯƠNG TRÌNH QUẢN LÝ GIAO VIÊN –--" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeachersService.addTeacher();
                    break;
                case 2:
                    iTeachersService.deleteTeacher();
                    break;
                case 3:
                    iTeachersService.displayTeacher();
                    break;
                case 4:
            return;
            }
        } while (true);
    }
}
