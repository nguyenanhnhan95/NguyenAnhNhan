package ss1_introduction.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name :");
        String name = sc.nextLine();
        System.out.printf("Hello :" + name);
    }
}
