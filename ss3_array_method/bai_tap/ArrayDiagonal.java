package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ArrayDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrayA = {{1, 2, 5, 4}, {5, 4, 6, 8}, {5, 9, 4, 7}, {4, 15, 4, 6}};
        int sum = 0;
        for (int i = 0; i < arrayA.length; i++) {
                sum+=arrayA[i][i]+arrayA[i][arrayA.length-1-i];
        }
        System.out.println("Sum position t diagonal=" + sum);
    }
}
