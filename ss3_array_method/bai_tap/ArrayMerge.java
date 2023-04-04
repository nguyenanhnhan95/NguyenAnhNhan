package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA = {2, 1, 5, 2, 6, 4, 7};
        int[] arrayB = {4, 5, 8, 2, 4, 6, 8};
        displayArr(mergeArr(arrayA, arrayB));
    }

    public static int[] mergeArr(int[] arrA, int[] arrB) {
        int[] arrayC = new int[arrA.length + arrB.length];
        for (int i = 0; i < arrayC.length; i++) {
            if (i < arrA.length) {
                arrayC[i] = arrA[i];
            } else {
                arrayC[i] = arrB[i - arrA.length];
            }
        }
        return arrayC;
    }

    public static void displayArr(int[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            System.out.println("A[" + i + "]=" + arr[i]);
        }
    }
}
