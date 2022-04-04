package PracticeLB.ARRAY;

import java.util.Arrays;

public class MinimizeTheHeights {

    // Method
    public static int minimizeTheHeights(int[] arr, int n, int k) {
        // Initialize max, min, & result to 0
        int max = 0;
        int min = 0;
        int result = 0;

        // Sort
        Arrays.sort(arr);
        // Sorting last element = max & first element = min
        // max - min
        result = arr[n-1] - arr[0];

        // loop i=1; because we do not subtract the first value
        for (int i=1; i<n; i++) {
            // ignore negative value which is smaller & equal than k
            if (arr[i] >= k) {
                // Maximizing that value which we cannot decrement (last value of border)
                max = Math.max(arr[i-1] + k, arr[n-1] - k);
                // i to subtract and increase the initial value and check
                min = Math.min(arr[i] - k, arr[0] + k);
                result = Math.min(result, max-min);
            }
            else {
                continue;
            }
        }
        return result;
    }
        // Main Function
        public static void main(String[] args) {
            int[] arr = { 7, 4, 8, 8, 8, 9 };
            int n = arr.length;
            int k = 6;
            int result = minimizeTheHeights(arr,n,k);
            System.out.println(result);
        }
}

// Small -> Big
// Big -> Small

// Time Complexity: O(nlogn)
//Space Complexity: O(n)