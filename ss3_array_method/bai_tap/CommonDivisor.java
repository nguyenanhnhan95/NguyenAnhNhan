package ss3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one number find ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print(Arrays.toString(findDivisor(number)));
    }

    public static int[] findDivisor(int number) {
        int countN = 0;
        byte j = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                countN++;
            }
        }
        int[] arrayA = new int[countN];
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                arrayA[j] = i;
                j++;
            }
        }
        return arrayA;
    }
}
