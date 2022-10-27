package FuramaResorts.Controllers;

import FuramaResorts.Service.ICustomerManagementService;
import FuramaResorts.Service.Ipml.CustomerManagementIpml;

import java.util.Scanner;

public class CustomerManagementController {
    Scanner scanner = new Scanner(System.in);
    int choice;
    ICustomerManagementService iCustomerManagementService = new CustomerManagementIpml();
    public void menuCustomer(){
        do{
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    iCustomerManagementService.displayCustomer();
                    break;
                case 2:
                    iCustomerManagementService.addCustomer();
                    break;
                case 3:
                    iCustomerManagementService.editCustomer();
                    break;
                case 4:
                    return;
            }
        } while (true);



    }
}
