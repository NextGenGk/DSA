package Algorithm;

public class KadaneAlgorithm {

    public static int maxSubArraySum(int[] arr) {
        int currentSum = 0;
        int maxSum = 0;

        for (int i=0; i<arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int result = maxSubArraySum(arr);
        System.out.println(result);
    }
}
