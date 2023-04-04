package ss3_array_method.thuc_hanh;

import java.util.Objects;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter name to find :");
        String name = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                System.out.print("position student :" + i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("not find");
        }
    }
}
