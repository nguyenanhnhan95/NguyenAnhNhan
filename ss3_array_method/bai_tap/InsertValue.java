package ss3_array_method.bai_tap;

import java.util.Scanner;

public class InsertValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of element in arr :");
        byte size = sc.nextByte();
        int[] arrayA = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("A[" + i + "]=");
            arrayA[i] = sc.nextInt();
        }
        System.out.printf("Enter position insert :");
        byte index = sc.nextByte();
        System.out.printf("Enter value insert :");
        int value = sc.nextInt();
        displayArray(insertIndex(arrayA, index, value));
    }

    public static int[] insertIndex(int[] arr, int index, int value) {
        int[] arrayB = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arrayB[i] = value;
                for (int j = i + 1; j < arr.length + 1; j++) {
                    arrayB[j] = arr[j - 1];
                }
                break;
            }
            arrayB[i] = arr[i];
        }
        return arrayB;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("A[" + i + "]=" + arr[i]);
        }
    }
}
