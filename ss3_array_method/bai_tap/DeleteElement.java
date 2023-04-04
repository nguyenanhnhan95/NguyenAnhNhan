package ss3_array_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter x to delete :");
        int index = Integer.parseInt(sc.nextLine());
        int[] arrayA = {2, 5, 3, 6, 4, 3, 7};
        displayArr(deleteIndex(arrayA, index));
    }

    public static int[] deleteIndex(int[] arr, int index) {
        if (countAppear(arr, index) == 0) {
            System.out.println("Not find " + index);
            return arr;
        }
        byte countN = countAppear(arr, index);
        int[] arrayB = new int[arr.length - countN];
        for (byte i = 0; i < arr.length - countN; i++) {
            if (arr[i] == index) {
                for (byte j = i; j < arr.length - 1 - countN; j++) {
                    arrayB[j] = arr[j + 1];
                }
                continue;
            }
            arrayB[i] = arr[i];
        }
        return arrayB;
    }

    public static void displayArr(int[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            System.out.println("A[" + i + "]=" + arr[i]);
        }
    }

    public static byte countAppear(int[] arr, int index) {
        byte count = 0;
        for (int a : arr) {
            if (index == a) {
                count++;
            }
        }
        return count;
    }
}
