package Sorting;

public class SelectionSort {

    // SelectionSort Method
    static void selectionSort(int[] arr){
        for (int j=0; j< arr.length; j++){
            int smallest = j;
            for (int i=j+1; i<arr.length; i++){
                if (arr[i] < arr[smallest]){
                    smallest = i;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[j];
            arr[j] =  temp;
        }
    }

    // Printing an Array
    static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

    // Main Class
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3, 2};

        SelectionSort.selectionSort(arr);
        SelectionSort.printArray(arr);
    }
}
