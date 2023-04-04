package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you deposit in bank :");
        int money = Integer.parseInt(sc.nextLine());
        double rate = 7.5;
        System.out.print("Enter number month :");
        byte numberMonth = sc.nextByte();
        double amountInterest = money * (rate / (12 * 100)) * numberMonth;
        System.out.print("amount interest =" + amountInterest);
    }
}
