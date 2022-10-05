package ss1_introduction.exercise;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class ReadNumberToString {
    public static String units(int number) {
        switch (number) {
            case 1:
                return "one";

            case 2:
                return "two";
            case 3:
                return "three";

            case 4:
                return "four";
            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return " ";
        }
    }

    public static String numberTeen(int number) {
        switch (number) {
            case 11:
                return "eleven";

            case 12:
                return "twelve";
            case 13:
                return "thirdteen";

            case 14:
                return "fourteen";
            case 15:
                return "fifteen";

            case 16:
                return "sixteen";

            case 17:
                return "seventeen";

            case 18:
                return "eightteen";

            case 19:
                return "nineteen";
            default:
                return " ";
        }
    }

    public static String dozens(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";

            case 4:
                return "fourty";
            case 5:
                return "fifty";

            case 6:
                return "sixty";

            case 7:
                return "seventy";

            case 8:
                return "eightty";

            case 9:
                return "ninety";
            default:
                return " ";
        }
    }

    public static String abd(int number) {
        switch (number) {
            case 1:
                return "one hundred";
            case 2:
                return "two hundred ";
            case 3:
                return "three hundred";

            case 4:
                return "four hundred";
            case 5:
                return "five hundred";

            case 6:
                return "six hundred";

            case 7:
                return "seven hundred";

            case 8:
                return "eight hundred";

            case 9:
                return "nine hundred";
            default:
                return " ";
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Moi ban nhap so tu 0 -> 999 toy se dich sang tieng anh: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (0 < number && number <= 999) {
//                System.out.println("Ban da nhap hop le.");
                if (number <= 10) {
                    System.out.println("So " + number + " : " + units(number));
                } else if (number < 20) {
                    System.out.println("So " + number + " : " + numberTeen(number));

                } else if (number < 100) {
                    int dozens = number / 10;
                    int units = number - (dozens * 10);
                    System.out.println("So " + number + " : " + dozens(dozens) + " " + units(units));
                } else {
                    String hangChuc = " ";
                    int hundred = number / 100;
                    int dozens = (number - (hundred * 100));
                    if (dozens <= 10) {
                        hangChuc = units(dozens);
                    } else if (dozens < 20) {
                        hangChuc = numberTeen(dozens);
                    } else if (dozens < 100) {
                        int a = dozens / 10;
                        int b = dozens - (a * 10);
                        hangChuc = dozens(a) + " " + units(b);
                    }
                    System.out.println("So " + number + " : " + units(hundred) + " hundred "  + hangChuc);
                }
                break;
            } else {
                System.out.println("Ban da nhap sai!!");
            }
        }
    }
}
