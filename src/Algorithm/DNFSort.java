package Algorithm;

public class DNFSort {

    // Swap Function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method
    static void dnfSort(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high) {
            // If 0, swap arr[low] and arr[mid], low++, mid++
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            // If 1, mid++
            else if (arr[mid] == 1) {
                mid++;
            }
            // If 2, swap arr[mid] and arr[high], high--
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Main Function
    public static void main(String[] args)
    {
        int[] arr = { 0,0,0,2,2,2,1,1,1 };
        int n = arr.length;
        dnfSort(arr,n);
        for (int e : arr)
            System.out.print(e + " ");
    }
}

// If 0, swap arr[low] and arr[mid], low++, mid++
// If 1, mid++
// If 2, swap arr[mid] and arr[high], high--