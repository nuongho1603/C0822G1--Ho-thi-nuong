package ss2_.practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class InterestCalcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien muon vay:");
        double deposits = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap lai suat hang thang:");
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.println("So thang cho vay:");
        int month = Integer.parseInt(scanner.nextLine());
        double interest =0;
       for(int i =0 ; i< month;i++) {
           interest = deposits * rate/12 * month;
       }
        System.out.println("So tien lai cua ban la=" +interest);
    }
}
