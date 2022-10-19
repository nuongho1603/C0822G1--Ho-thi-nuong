package FuramaResort.Controllers;

import FuramaResort.Service.IService;

import java.util.Scanner;

public class FuramaController {


    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int number;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("Moi ban chon chuc nang of menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeController.menuEmployeeController();
                    break;

                case 2:
                    do{
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");

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
                        }

                    } while (number <0 && number >4);

                case 3:
                    do{
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n");

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
                        }

                    } while (number <0 && number >4);
                case 4:
                    do{
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tReturn main menu\n");

                        System.out.print("Moi ban nhap dich vu trong menu con: ");
                        number = Integer.parseInt(scanner.nextLine());
                        switch (number){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:

                        }

                    } while (number <0 && number >3);
                case 5:
                    do{
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");

                        System.out.print("Moi ban nhap dich vu trong menu con: ");
                        number = Integer.parseInt(scanner.nextLine());
                        switch (number){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                        }

                    } while (number <0 && number >3);
                case 6:
                    System.exit(6);
            }
            if (choice < 0 || choice > 7) {
                System.out.println("Cai ban chon khong co trong menu, vui lofng nhap lai!");
            }
        } while (true);
    }

}
