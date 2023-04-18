package ss13_sort_algorithm.bai_tap.algorithm_illustration;

public class MainInsertSort {
    public static void main(String[] args) {
        int[] arrayA = new int[]{5,1,6,4,9,8,2,4,6,10};
        for (int i = 0; i < insertSort(arrayA).length; i++) {
            System.out.println(insertSort(arrayA)[i]);
        }
    }
    public static int[] insertSort(int[] arr){
        int tem;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[i]<arr[j]){
                    tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        return arr;
    }
}
