package FuramaResorts.Controllers;

import FuramaResorts.Service.IEmployeeManagementService;
import FuramaResorts.Service.Ipml.EmployeeManagementIpml;

import java.util.Scanner;

public class EmployeeManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
IEmployeeManagementService iEmployeeManagementService = new EmployeeManagementIpml();
    public void menuEmployee() {
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");

            System.out.println("lựa chọn của bạn là: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iEmployeeManagementService.display();
                    break;
                case 2:
                    iEmployeeManagementService.add();
                    break;
                case 3:
                    iEmployeeManagementService.delete();
                    break;
                case 4:
                    iEmployeeManagementService.edit();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

}
