package ss1_introduction.bai_tap;

import java.util.Scanner;

public class TransferMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short rate = 23000;
        System.out.printf("Enter money USD ");
        short moneyUsd = sc.nextShort();
        System.out.printf(+moneyUsd + "=" + moneyUsd * rate + "VND");
    }
}
