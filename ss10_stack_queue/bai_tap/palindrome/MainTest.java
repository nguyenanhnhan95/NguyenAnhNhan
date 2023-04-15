package ss10_stack_queue.bai_tap.palindrome;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any from keyboard");
        String checkPalindrome = sc.nextLine();
        Palindrome palindrome = new Palindrome(checkPalindrome);
        System.out.println(palindrome.checkPalindrome());
    }
}
