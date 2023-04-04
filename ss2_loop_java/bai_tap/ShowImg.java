package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class ShowImg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice = 0;
        while (choice != 4) {
            System.out.println("1. Print the rectanle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit ");
            System.out.printf("Enter your choice");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("*********");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = -1; j < i; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    break;
            }
        }
    }
}
