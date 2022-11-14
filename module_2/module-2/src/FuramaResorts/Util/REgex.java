package FuramaResorts.Util;

import java.util.Scanner;

public class REgex {
    static Scanner scanner = new Scanner(System.in);

    public static String regexString() {

        String regex = "[A-za-z]+";
        String name;
        do {

            name = scanner.nextLine();
            if (name.matches(regex)) {
                return name;
            }
            System.out.print("Nhap lai: ");
        } while (true);
    }
}
