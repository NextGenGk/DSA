package Sorting;

public class InsertionSort {

    // Insertion Sort Method
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while ( j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    // Printing an Array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Class
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3, 2};
        InsertionSort.insertionSort(arr);
        InsertionSort.printArray(arr);

    }
}
