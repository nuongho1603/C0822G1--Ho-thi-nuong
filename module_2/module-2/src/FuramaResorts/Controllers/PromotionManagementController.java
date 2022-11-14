package FuramaResorts.Controllers;

import FuramaResorts.Service.IPromotionManagementService;
import FuramaResorts.Service.Ipml.PromotionManagementIpml;

import java.util.Scanner;

public class PromotionManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
IPromotionManagementService iPromotionManagementService = new PromotionManagementIpml();
    public void menuPromotion() {
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
