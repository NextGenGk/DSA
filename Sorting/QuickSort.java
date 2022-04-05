package Sorting;

public class QuickSort {

    // partition
    static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j= start; j<=end; j++){
            if (arr[j] <= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    // Main Quick Sort Method
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1, end);
        }
    }

    // Printing an Array
    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

    // Main Class
    public static void main(String[] args) {
        int arr[] = {10, 2, 6, 8, 1, 9, 7};
        QuickSort.quickSort(arr,0,arr.length-1);
        QuickSort.printArray(arr);
    }
}
