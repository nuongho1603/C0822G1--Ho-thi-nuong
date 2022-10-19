package FuramaResort.Controllers;

import FuramaResort.Service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void menuEmployeeController() {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int number;
        do{
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");

            System.out.print("Moi ban nhap dich vu trong menu con: ");
            number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
            }

        } while (true);
    }
    }

