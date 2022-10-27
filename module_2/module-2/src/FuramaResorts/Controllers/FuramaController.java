package FuramaResorts.Controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        CustomerManagementController customerManagementController = new CustomerManagementController();
        int choice;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("Mời bạn nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    employeeManagementController.menuEmployee();
                    break;
                case 2:
                    customerManagementController.menuCustomer();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
