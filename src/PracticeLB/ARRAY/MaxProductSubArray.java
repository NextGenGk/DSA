package PracticeLB.ARRAY;

public class MaxProductSubArray {

    // Method
    static long maxProduct(int[] arr, int n) {

        // Initialize max, min & result = arr[0]
        long max = arr[0];
        long min = arr[0];
        long result = arr[0];

        // looping
        for (int i=1; i<n; i++) {
            if (arr[i]== 0){
                min = 1;
                max = 1;
                continue;
            }

            // find max and min value and then update the value so, temp Holding the value
            long temp1 = arr[i] * max;
            long temp2 = arr[i] * min;

            max = Math.max(temp1, temp2);
            // check if current value is max
            max = Math.max(max, arr[i]);

            min = Math.min(temp1, temp2);
            // check if current value is min
            min = Math.min(min, arr[i]);

            // result depends of max value & previous max value
            result = Math.max(result, max);
        }
        return result;
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 0, 7, -8, -2 };
        int n = arr.length;
        System.out.println(maxProduct(arr,n));
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)