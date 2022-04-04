package Sorting;

public class BubbleSort {

    // Bubble Sort Method
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Printing an Array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Class
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {7, 8, 1, 3, 2};
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }
}
