package PracticeLB.ARRAY;

public class BestTimeToBuyAndSellStocks1 {

    // Method
    public static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minSoFar = arr[0];

        for (int i=0; i<arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);

            int profit = arr[i] - minSoFar;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 4};
        System.out.println(maxProfit(arr));
    }
}

// Time = O(N)
// Space = O(1)