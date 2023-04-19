package ss13_sort_algorithm.bai_tap.algorithm_illustration;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 5, 6, 4, 9, 8, 2, 4, 6, 10};
        System.out.println(Arrays.toString(insertionSort(arrayA)));
    }

    public static int[] insertionSort(int[] array) {
        int pos, x;
        System.out.println("Gia tri khoi tao biến pos và x");
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            System.out.println("Gán giá trị x = Array[" + i + "] pos =" + i);
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Nếu pos>0 và array[" + (pos - 1) + "]> array[" + i + "]");
                array[pos] = array[pos - 1]; // đổi chỗ
                System.out.println("đổi chỗ array[" + pos + "]=array[" + (pos - 1) + "]");
                pos--;
            }
            System.out.println("(pos-1)+< array[" + i + "]");
            System.out.println("Gan array[" + pos + "]=" + x);
            array[pos] = x;
            System.out.println("-------------------");
        }
        return array;
    }
}
