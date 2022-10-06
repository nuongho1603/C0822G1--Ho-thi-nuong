package ss2_.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so muon check:");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " kh phai SNT dau nhee");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + "phai SNT dau nhee");
            else
                System.out.println(number + " kh phai SNT dau nhee");
        }
    }
}


