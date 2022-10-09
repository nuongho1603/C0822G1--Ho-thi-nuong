package ss2_.exercise;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int choosePicture;
                do {
                    System.out.print("Nhập số hình muốn vẻ: ");
                    choosePicture = scanner.nextInt();
                    if (choosePicture == 4) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 9; j++) {
                                if (i + j > 5 && j - i < 5) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    } else if (choosePicture < 4 && choosePicture > 0) {
                        int m, n;
                        System.out.print("Nhập vào số hàng: ");
                        m = scanner.nextInt();
                        System.out.print("Nhập vào số cột: ");
                        n = scanner.nextInt();
                        if (choosePicture == 1) {
                            for (int i = 0; i < m; i++) {
                                for (int j = 0; j < n; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        } else if (choosePicture == 2) {
                            for (int i = 0; i < m; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        } else {
                            for (int i = m - 1; i >= 0; i--) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                    } else {
                        System.out.println("Hãy nhập số từ 1 đến 4");
                    }
                } while (choosePicture > 4 || choosePicture < 0);
            }
        }