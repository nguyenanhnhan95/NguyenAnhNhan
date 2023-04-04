package ss3_array_method.bai_tap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte countN = 0;
        System.out.printf("Enter one list :");
        String inputStr = sc.nextLine();
        System.out.printf("Enter any character :");
        char inputCharacter = sc.next().charAt(0);
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == (inputCharacter)) {
                countN++;
            }
        }
        System.out.printf("Count appear=" + countN);
    }
}
