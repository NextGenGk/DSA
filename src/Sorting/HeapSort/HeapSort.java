package Sorting.HeapSort;

public class HeapSort {
    int[] arr = null;

    // Constructor
    public HeapSort(int[] arr){
        this.arr = arr;
    }

    // Heap Sort Method
    public void heapSort(){
       BinaryHeap binaryHeap = new BinaryHeap(arr.length);
       for (int i=0; i<arr.length; i++) {
           binaryHeap.insertInHeap(arr[i]);
       }

       for (int i=0; i<arr.length; i++) {
           arr[i] = binaryHeap.extractHeadOfHeap();
       }
    }

    // Printing an Array
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    // Main Class
    public static void main(String[] args) {
        int arr[] = {10, 2, 6, 8, 1, 9, 7};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.heapSort();;
        heapSort.printArray(arr);

    }
}
