package FuramaResorts.Controllers;

import FuramaResorts.Service.IFacilityManagementService;
import FuramaResorts.Service.Ipml.FacilityManagementIpml;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityManagementController {
    Scanner scanner = new Scanner(System.in);
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    IFacilityManagementService iFacilityManagementService = new FacilityManagementIpml();

    public void menuFacility() {
        int choice;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New Room\n" +
                    "3.\tBack to menu\n");
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
