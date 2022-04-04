package PracticeLB.ARRAY;

import java.util.Arrays;

public class KthSmallestElement {
    // Function to return kth small
    // element in a given array
    public static int kthSmallest(Integer[] arr, int k) {
        // Sort the given array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // Return kth element in
        // the sorted array
        return arr[k - 1];
    }

    // Main Function
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{12, 3, 5, 7, 19}; // {3, 5, 7, 12, 19}
        int k = 2;
        System.out.print("Kth smallest element is " + kthSmallest(arr, k));
    }
}

// Given an array and a number k where k is smaller than the size of the array, we need to find the k’th Small
// element in the given array. It is given that all array elements are distinct.
// {12, 3, 5, 7, 19};
// {3, 5, 7, 12, 19}
// 5

// Time = O(NlogN)
// Space = O(1)