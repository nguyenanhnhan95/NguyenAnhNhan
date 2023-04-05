package ss3_array_method.bai_tap;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.printf(findFibonacci());
    }

    public static String findFibonacci() {
        String listFibonacci = "0 1";
        int i = 0;
        int j = 1;
        while (true) {
            i += j;
            j += i;
            if (i > 100 || j > 100) {
                return listFibonacci;
            }
            listFibonacci += " " + i + " " + j;
        }
    }
}
