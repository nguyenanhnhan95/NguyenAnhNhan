package ss1_introduction.bai_tap;

import java.util.Scanner;

public class ReadWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrWord = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arrWord1 = {"", "one", "twen", "thir", "four", "fif", "six", "seven", "eight", "nine"};
        System.out.print("Enter one number to read");
        short number = sc.nextShort();
        switch ((number + "").length()) {
            case 1:
                if (number == 0) {
                    System.out.println("zero");
                    break;
                }
                for (byte i = 0; i < 10; i++) {
                    if (arrNumber[i] == number) {
                        System.out.println(arrWord[i]);
                        break;
                    }
                }
            case 2:
                if (number == 10) {
                    System.out.println(+number + "Ten");
                }
                if (number == 11) {
                    System.out.print(+number + "Eleven");
                }
                if (number == 12) {
                    System.out.print(+number + "Twelve");
                }
                if (number == 13) {
                    System.out.print(+number + "thirteen");
                }
                if (number > 13 && number < 20) {
                    for (byte i = 3; i < 10; i++) {
                        if (arrNumber[i] == number % 10) {
                            System.out.print(arrWord[i] + "teen");
                            break;
                        }
                    }
                }
                if (number / 10 > 2) {
                    System.out.printf(arrWord1[number / 10] + "ty-" + arrWord[number % 10]);
                    break;
                }
            case 3:
                if (number == 100) {
                    System.out.printf("onehundred and ");
                    break;
                }
                System.out.print(arrWord[number / 100] + "hundred and ");
                number -= (number / 100) * 100;
                if (number == 10) {
                    System.out.println("and Ten");
                }
                if (number == 11) {
                    System.out.print("eleven Eleven");
                }
                if (number == 12) {
                    System.out.print("and Twelve");
                }
                if (number == 13) {
                    System.out.print("and thirteen");
                }
                if (number > 13 && number < 20) {
                    for (byte i = 3; i < 10; i++) {
                        if (arrNumber[i] == number % 10) {
                            System.out.print(arrWord[i] + "teen");
                            break;
                        }
                    }
                }
                if (number / 10 >= 2) {
                    System.out.printf(arrWord1[number / 10] + "ty " + arrWord[number % 10]);
                    break;
                }
        }
    }
}
