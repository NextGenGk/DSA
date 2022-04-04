package PracticeLB.ARRAY;

import java.util.Arrays;

public class InversionCount {

    // Function
    private static int mergeAndCount(int[] arr, int l, int m, int r) {

        // Left SubArray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right SubArray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0;
        int j = 0;
        int k = l;
        int swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        {
            return swaps;
        }
    }

    // Merge sort function
    private static int mergeSortAndCount(int[] arr, int l, int r)
    {

        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subArray count
            // + right subArray count + merge count

            // Left subArray count
            count += mergeSortAndCount(arr, l, m);

            // Right subArray count
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    // Main Function
    public static void main(String[] args)
    {
        int[] arr = { 8, 4, 2, 1 };

        System.out.println(
                mergeSortAndCount(arr, 0, arr.length - 1));
    }
}

// Time = O(NlogN)
// Space = O(n)