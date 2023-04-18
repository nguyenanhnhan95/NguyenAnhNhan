package ss12_search_algorithm.bai_tap.consecutive_max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        List<Character> arrayA = new ArrayList<>();
        List<Character> arrayCheck = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            arrayA.add(inputString.charAt(i));
            for (int j = i + 1; j < inputString.length(); j++) {
                if (((int) inputString.charAt(j)) - ((int) arrayA.get(arrayA.size() - 1)) > 0) {
                    arrayA.add(inputString.charAt(j));
                } else {
                    break;
                }
            }
            if (arrayA.size() > arrayCheck.size()) {
                arrayCheck.clear();
                arrayCheck.addAll(arrayA);
                arrayA.clear();
            } else {
                arrayA.clear();
            }
        }
        System.out.println(arrayCheck);

    }
}
