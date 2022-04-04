package PracticeLB.ARRAY;

public class KadaneAlgorithm {

    // Function
    public static int maxSubArraySum(int[] arr) {

        // Initialize maxSum And currentSum to 0
        int currentSum = 0;
        int maxSum = 0;

        // looping
        for (int i=0; i<arr.length; i++) {
            // Adding 1st element to currentSum
            currentSum = currentSum + arr[i];
            // currentSum is greater than maxSum then, currentSum is maxSum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            // currentSum is less than 0, then, currentSum = 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int result = maxSubArraySum(arr);
        System.out.println(result);
    }
}
// Time - O(n)
// Space - O(1)