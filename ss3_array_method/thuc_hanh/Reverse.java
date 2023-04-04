package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberN;
        int temp;
        int[] arrayA;
        do {
            System.out.print("Enter length array :");
            numberN = sc.nextByte();
        } while (numberN > 19 || numberN < 1);
        arrayA = new int[numberN];
        for (int i = 0; i < numberN; i++) {
            System.out.print("A[" + i + "]=");
            arrayA[i] = sc.nextInt();
        }
        for (int i = 0; i < numberN / 2; i++) {
            temp = arrayA[i];
            arrayA[i] = arrayA[numberN - i - 1];
            arrayA[numberN - i - 1] = temp;
        }
        for (int i = 0; i < numberN; i++) {
            System.out.print("A[" + i + "]=" + arrayA[i]);
        }
    }
}
