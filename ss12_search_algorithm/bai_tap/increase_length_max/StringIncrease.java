package ss12_search_algorithm.bai_tap.increase_length_max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào:");
        String inputString = sc.nextLine();
        List<Character> resultArray = new ArrayList<>();
        List<Character> resultArrayB = new ArrayList<>();
        System.out.println("------------");
        int sizeNew = 0;
        int size = inputString.length();
        for (int i = 0; i < size; i++) {
            resultArray.add(inputString.charAt(i));
            for (int j = i + 1; j < size; j++) {
                if (resultArray.get(resultArray.size() - 1) < inputString.charAt(j)) {
                    resultArray.add(inputString.charAt(j));
                }
            }
            if (resultArray.size() > resultArrayB.size()) {
                resultArrayB.addAll(resultArray);
                resultArray.clear();
            } else {
                resultArray.clear();
            }
        }
        System.out.println(resultArrayB);
    }
}
