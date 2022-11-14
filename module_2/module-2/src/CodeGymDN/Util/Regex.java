package CodeGymDN.Util;

import java.util.Scanner;

public class Regex {
   static Scanner scanner = new Scanner(System.in);
    public static String regexStudent(){
        String regexId = "\\d+";
        String string;
        do{
            string = scanner.nextLine();
            if(string.matches(regexId)){
                return string;
            }
            System.out.print("SAI QUÁ SAI.Nhập lại đi: ");
        }while (true);
    }

//    public static String
}
