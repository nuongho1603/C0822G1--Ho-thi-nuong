package FuramaResorts.Controllers;

import FuramaResorts.Models.Facility;
import FuramaResorts.Service.IFacilityManagementService;
import FuramaResorts.Service.Ipml.FacilityManagementIpml;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityManagementController {

    Scanner scanner = new Scanner(System.in);

    IFacilityManagementService iFacilityManagementService = new FacilityManagementIpml();

    public void menuFacility() {
        int choice;
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iFacilityManagementService.display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    iFacilityManagementService.displayMaintenance();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

public void add() {
    System.out.println("1. Add Room." +
            "2. Add Villa" +
            "3.Exit" +
            "4.Return");

    int choice = Integer.parseInt(scanner.nextLine());

    switch (choice) {
        case 1:
            iFacilityManagementService.addRoom();
            break;
        case 2:
            iFacilityManagementService.addVilla();
            break;
        case 3:
            System.exit(0);
            break;
        case 4:
            return;
    }


}
}
