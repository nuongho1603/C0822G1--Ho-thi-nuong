package FuramaResorts.Controllers;

import FuramaResorts.Service.IBookingService;
import FuramaResorts.Service.Ipml.BookingIpml;

import java.util.Scanner;

public class BookingController {
Scanner scanner = new Scanner(System.in);
IBookingService iBookingService = new BookingIpml();
int choice;
    public void menuBooking(){
        do{
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tReturn main menu\n");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    iBookingService.addBooking();
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        }while (true);
    }
}
