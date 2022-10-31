package ss19.exercise;

import java.util.Scanner;

public class PhoneExampleTest {
    public static PhoneExample phoneExample;

    //public static String[] validPhoneName = new String[]{"84-0555555555","84-0123456844","84-1234567891","840111111185"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] validPhoneName;
        System.out.print("Nhap kich thuoc mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu vi tri thu " + (i + 1) + ": ");
            validPhoneName = new String[]{scanner.nextLine()};

            phoneExample = new PhoneExample();
            for (String phone : validPhoneName) {
                boolean isValid = phoneExample.validate(phone);
                System.out.println(phone + " " + isValid);
            }
        }
    }
}
