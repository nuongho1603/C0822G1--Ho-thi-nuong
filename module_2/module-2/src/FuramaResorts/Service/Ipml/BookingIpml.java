package FuramaResorts.Service.Ipml;

import FuramaResorts.Models.Booking;
import FuramaResorts.Service.IBookingService;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookingIpml implements IBookingService {
    Scanner scanner = new Scanner(System.in);

    //TreeMap<Booking,>
    @Override
    public void addBooking() {

    }

    public Booking info() {
        System.out.print("");
        int maBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        int ngayBatDau = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        int ngayKetThuc = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        int maKhachHang = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        String tenDichVu = scanner.nextLine();
        Booking booking = new Booking(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu);
        return booking;
    }
}
