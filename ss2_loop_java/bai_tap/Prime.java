package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean flag;
        String primeList = "0  1";
        for (int i = 3; i < 100; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeList += "  " + i;
            }
        }
        System.out.println("primes smaller 100 :" + primeList);
    }
}
