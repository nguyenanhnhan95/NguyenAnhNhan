package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter A[" + i + "]=");
            arrayA[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Min = " + findMin(arrayA));
    }

    static byte numberMin;

    public static int findMin(int[] arr) {
        for (int a : arr) {
            if (numberMin > a) {
                numberMin = (byte) a;
            }
        }
        return numberMin;
    }
}
