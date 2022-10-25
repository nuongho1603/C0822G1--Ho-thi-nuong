package ss15_exeption.practice;

import java.util.Scanner;

public class CalculationExample {
    public void calculationExample(int x, int y){
        try{
            int cong = x+y;
            int tru = x-y;
            int nhan = x*y;
            int chiaLayDu = x%y;
            System.out.println("Tổng: " +cong);
            System.out.println("Hiệu: " +tru);
            System.out.println("Tích: " +nhan);
            System.out.println("Thương (lấy dư): " +chiaLayDu);
        } catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x= ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter y= ");
        int y = Integer.parseInt(scanner.nextLine());
        CalculationExample calc = new CalculationExample();
        calc.calculationExample(x,y);
    }
}
