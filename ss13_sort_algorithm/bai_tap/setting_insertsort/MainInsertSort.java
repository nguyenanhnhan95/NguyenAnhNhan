package ss13_sort_algorithm.bai_tap.setting_insertsort;

import java.util.Arrays;

public class MainInsertSort {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 5, 6, 4, 9, 8, 2, 4, 6, 10};
        System.out.println(Arrays.toString(insertSort(arrayA)));
    }

    public static int[] insertSort(int[] arr) {
        int pos, x;
        for (int i = 1; i < arr.length; i++) {
            pos = i;
            x = arr[i];
            while (pos > 0 && arr[pos - 1] > x) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        return arr;
    }
}
