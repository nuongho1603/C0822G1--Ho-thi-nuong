package FuramaResort.Controllers;

import FuramaResort.Service.ResortService;

import java.util.Scanner;

public class FuramaController implements ResortService {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Moi ban chon chuc nang of menu: ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            switch (number){
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tDelete employee\n" +
                            "4\tEdit employee\n" +
                            "5\tReturn main menu\n");
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    break;
                case 6:
                    System.exit(6);
            }
            if(number < 0 || number > 7) {
                System.out.println("Cai ban chon khong co trong menu, vui lofng nhap lai!");
            }
        } while (number < 0 || number > 7);
    }

}
