package ss1_introduction.exercise;

import java.util.Scanner;

public class ReadNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để đọc: ");
        int number;
        number = scanner.nextInt();
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 999) {
            System.out.println("out of ability");
        } else if (number > 0 && number <= 99) {
            if ((number % 100) < 20 && (number % 100) > 10) {
                switch (number % 100) {
                    case 11:
                        System.out.print("eleven");
                        break;
                    case 12:
                        System.out.print("twelve");
                        break;
                    case 13:
                        System.out.print("thirdteen");
                        break;
                    case 14:
                        System.out.print("fourteen");
                        break;
                    case 15:
                        System.out.print("fifteen");
                        break;
                    case 16:
                        System.out.print("sixteen");
                        break;
                    case 17:
                        System.out.print(" seventeen");
                        break;
                    case 18:
                        System.out.print(" eighteen");
                        break;
                    case 19:
                        System.out.print(" nineteen");
                        break;
                }
            } else {
                switch ((number % 100) / 10) {
                    case 0:
                        break;
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("thirdty ");
                        break;
                    case 4:
                        System.out.print("fourty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (((number % 100) % 10)) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
        } else {
            switch (number / 100) {
                case 0:
                    break;
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
            }
            if ((number % 100) < 20 && (number % 100) > 10) {
                switch (number % 100) {
                    case 11:
                        System.out.print("and eleven");
                        break;
                    case 12:
                        System.out.print("and twelve");
                        break;
                    case 13:
                        System.out.print("and thirdteen ");
                        break;
                    case 14:
                        System.out.print("and fourteen ");
                        break;
                    case 15:
                        System.out.print("and fifteen ");
                        break;
                    case 16:
                        System.out.print("and sixteen ");
                        break;
                    case 17:
                        System.out.print("and seventeen ");
                        break;
                    case 18:
                        System.out.print("and eighteen ");
                        break;
                    case 19:
                        System.out.print("and nineteen ");
                        break;
                }
            } else {
                if (number % 100 < 10) {
                    switch (((number % 100) % 10)) {
                        case 1:
                            System.out.print("and one");
                            break;
                        case 2:
                            System.out.print("and two");
                            break;
                        case 3:
                            System.out.print("and three");
                            break;
                        case 4:
                            System.out.print("and four");
                            break;
                        case 5:
                            System.out.print("and five");
                            break;
                        case 6:
                            System.out.print("and six");
                            break;
                        case 7:
                            System.out.print("and seven");
                            break;
                        case 8:
                            System.out.print("and eight");
                            break;
                        case 9:
                            System.out.print("and nine");
                            break;
                    }
                } else {
                    switch ((number % 100) / 10) {
                        case 0:
                            break;
                        case 1:
                            System.out.print("and ten ");
                            break;
                        case 2:
                            System.out.print("and twenty ");
                            break;
                        case 3:
                            System.out.print("and thirdty ");
                            break;
                        case 4:
                            System.out.print("and fourty ");
                            break;
                        case 5:
                            System.out.print("and fifty ");
                            break;
                        case 6:
                            System.out.print("and sixty ");
                            break;
                        case 7:
                            System.out.print("and seventy ");
                            break;
                        case 8:
                            System.out.print("and eighty ");
                            break;
                        case 9:
                            System.out.print("and ninety ");
                            break;
                    }
                    switch (((number % 100) % 10)) {
                        case 1:
                            System.out.print("one");
                            break;
                        case 2:
                            System.out.print("two");
                            break;
                        case 3:
                            System.out.print("three");
                            break;
                        case 4:
                            System.out.print("four");
                            break;
                        case 5:
                            System.out.print("five");
                            break;
                        case 6:
                            System.out.print("six");
                            break;
                        case 7:
                            System.out.print("seven");
                            break;
                        case 8:
                            System.out.print("eight");
                            break;
                        case 9:
                            System.out.print("nine");
                            break;
                    }
                }
            }
        }
    }
}
