package PracticeLB.ARRAY;

public class MaxSumSubArray {

    // Method
    public static int maxSumSubArray(int[] arr) {
        // first we initialize currentSum and maxSum = 0
        int currentSum = 0;
        int maxSum = 0;

        // loop
        for (int i=0; i<arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum+arr[i]);
        }

        // check currentSum is greater than maxSum, then maxSum = currentSum
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
        return maxSum;
    }

    // Main Function
    public static void main(String[] args) {
        int[] a = {1,2,3,-2,5};
        System.out.println("Maximum contiguous sum is " +
                maxSumSubArray(a));

    }
}

// first we initialize currentSum and maxSum = 0
// loop
// check currentSum is greater than maxSum, then maxSum = currentSum