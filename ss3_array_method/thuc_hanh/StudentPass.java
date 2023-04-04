package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arrayA;
        do {
            System.out.println("Enter number of student pass :");
            size = Integer.parseInt(sc.nextLine());
            if (size > 30) {
                System.out.println("size shoudn't exceed 30");
            }
        } while (size > 30 || size < 0);
        arrayA = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Student's mark " + (i + 1) + "=");
            arrayA[i] = sc.nextInt();
        }
    }
}
