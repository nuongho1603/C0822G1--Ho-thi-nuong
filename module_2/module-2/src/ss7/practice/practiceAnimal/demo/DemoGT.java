package ss7.practice.practiceAnimal.demo;

public class DemoGT {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i + j == 4 || j - i == 5) {
                    System.out.print(i + 1);
                } else if (i > 4 && i - j == 4 || i + j == 13) {
                    System.out.print(9-i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
