package ss11_map_binary.bai_tap.count_word;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountString {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        boolean flag;
        String stringNew = inputString.toLowerCase();
        System.out.println(stringNew);
        System.out.println(stringNew.length());
        for (int i = 0; i < stringNew.length(); i++) {
            flag = true;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getKey() == stringNew.charAt(i)) {
                    entry.setValue(entry.getValue() + 1);
                    flag = false;
                }
            }
            if (flag) {
                map.put(stringNew.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
