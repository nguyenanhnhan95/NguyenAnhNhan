package ss3_array_method.bai_tap;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter one to check :");
        int number = Integer.parseInt(sc.nextLine());
        System.out.printf(isOdd(number));
    }

    public static String isOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
