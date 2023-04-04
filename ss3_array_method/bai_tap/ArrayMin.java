package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrayA = {{1, 2, 5, 4}, {5, 4, 6, 8, 40, 45}, {5, 9, 4, 7, 15, 26, 4}};
        int numberMin = arrayA[0][0];
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (numberMin > arrayA[i][j]) {
                    numberMin = arrayA[i][j];
                }
            }
        }
        System.out.println("Array's Max =" + numberMin);
    }
}

