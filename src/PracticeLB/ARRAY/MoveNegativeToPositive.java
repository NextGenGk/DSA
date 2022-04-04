package PracticeLB.ARRAY;

public class MoveNegativeToPositive {

    // a utility function to swap two elements of an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // function to shift all negative integers to the left
    // and all positive integers to the right
    // using Dutch National Flag Algorithm
    public static void moveNegativeToPositive(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] <= 0) {
                low++;
            } else {
                swap(arr, low, high);
                high--;
            }
        }
    }

    // Main Function
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1 };
        moveNegativeToPositive(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}

// beginning and all positive numbers to the end with
// constant extra space

// Here, we will use the famous Dutch National Flag Algorithm for two “colors”. The first color will be for all
// negative integers and the second color will be for all positive integers. We will divide the array into three
// partitions with the help of two pointers, low and high.
//
//1. ar[1…low-1] negative integers
//2. ar[low…high] unknown
//3. ar[high+1…N] positive integers

// Time complexity: O(N)
//Auxiliary Space: O(1)