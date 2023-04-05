package ss3_array_method.bai_tap;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter year to year leap :");
        int year = Integer.parseInt(sc.nextLine());
        System.out.printf("Check " + year + "is" + checkLeap(year));
    }

    public static boolean checkLeap(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 4 == 0) {
                return true;
            }
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
