package ss3_array_method.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number check prime :");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(checkPrime(number));
    }

    public static boolean checkPrime(int number) {
        if (number <= 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
