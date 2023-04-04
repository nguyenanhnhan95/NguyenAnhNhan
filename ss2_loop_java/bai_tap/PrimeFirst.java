package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class PrimeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String primeTwenty = "0  1";
        byte countN = 0;
        int numberN = 3;
        boolean flag;
        while (countN < 18) {
            flag = true;
            for (int i = 2; i < numberN; i++) {
                if (numberN % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeTwenty += "   " + numberN;
                countN++;
            }
            numberN++;
        }
        System.out.printf("Twenty prime :");
        System.out.print(primeTwenty);
    }
}
