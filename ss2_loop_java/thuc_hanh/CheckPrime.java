package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check prime :");
        int number = sc.nextInt();
        boolean flag = true;
        for (byte i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print(+number + "is number prime");
        } else {
            System.out.print(+number + "isn't number prime");
        }
    }
}
