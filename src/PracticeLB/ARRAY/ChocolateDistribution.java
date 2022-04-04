package PracticeLB.ARRAY;

import java.util.Arrays;

public class ChocolateDistribution {

    // arr[0..n-1] represents sizes of
    // packets. m is number of students.
    // Returns minimum difference between
    // maximum and minimum values of
    // distribution.
    static int findMinDiff(int[] arr, int n, int m)
    {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        // Sort the given packets
        Arrays.sort(arr);

        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;
        // Largest number of chocolates
        int mindiff = Integer.MAX_VALUE;

        // Find the subArray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subArray is minimum.

        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < mindiff)
                mindiff = diff;
        }
        return mindiff;
    }

    // Main Function
    public static void main(String[] args)
    {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;  // Number of students
        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, m));

    }
}

// Time Complexity: O(n Log n)
// Auxiliary Space: O(1)

// Logic
// i+m-1<n

//   for (int i = 0; i + m - 1 < n; i++)
//        {
//            int diff = arr[i+m-1] - arr[i];
//            if (diff < minDiff)
//                minDiff = diff;
//        }
//        return minDiff;
//    }

// ![](../../../../../AppData/Local/Temp/Chocolate-Distribution-Problem.png)

