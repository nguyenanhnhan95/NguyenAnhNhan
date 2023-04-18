package ss12_search_algorithm.bai_tap.binary_recursion;

public class Binary {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 5, 6, 7, 34, 46, 78};

        System.out.println(binarySearch(arrayA, 0, arrayA.length, 70));
    }

    public static boolean binarySearch(int[] array, int left, int right, int key) {
        int mid = (left + right) / 2;
        if (left > right) {
            return false;
        }
        if (array[mid] == key) {
            return true;
        }
        if (key > array[mid]) {
            return binarySearch(array, mid + 1, right, key);
        }
        if (key < array[mid]) {
            return binarySearch(array, left, mid - 1, key);
        }
        return false;
    }
}
