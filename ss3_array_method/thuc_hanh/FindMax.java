package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[10];
        for (byte i = 0; i < arrayA.length; i++) {
            System.out.println("Enter A[" + i + "]=");
            arrayA[i] = Integer.parseInt(sc.nextLine());
        }
        int numberMax = 0;
        for (int a : arrayA) {
            if (numberMax < a) {
                numberMax = a;
            }
        }
        System.out.println("Max = " + numberMax);
    }
}
