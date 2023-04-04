package ss3_array_method.bai_tap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte numberColumn;
        int sumColumn = 0;
        System.out.printf("Enter number of column :");
        byte column = sc.nextByte();
        System.out.printf("Enter number of row :");
        byte row = sc.nextByte();
        int[][] arrayA = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("A[" + i + "][" + j + "]=");
                arrayA[i][j] = sc.nextInt();
            }
        }
        do {
            System.out.printf("Enter column to caculate sum :");
            numberColumn = sc.nextByte();
            if (numberColumn > column) {
                System.out.printf("Exceed size array :");
            }
        } while (numberColumn > column);
        for (int i = 0; i < arrayA.length; i++) {
            sumColumn += arrayA[i][numberColumn];
        }
        System.out.printf("Sum number of column :" + sumColumn);
    }
}
