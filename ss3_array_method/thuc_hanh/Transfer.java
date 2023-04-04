package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        byte choice = -1;
        double result;
        while (choice != 0) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice :");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit :");
                    celsius = sc.nextDouble();
                    fahrenheit = (9 * celsius) / 5.0 + 32;
                    System.out.println(+celsius + "=" + fahrenheit);
                    break;
                case 2:
                    System.out.println("Enter celsius :");
                    celsius = sc.nextDouble();
                    fahrenheit = (5.0 / 9) * (celsius - 32);
                    System.out.println(+fahrenheit + "=" + celsius);
                    break;
            }
        }
    }
}
