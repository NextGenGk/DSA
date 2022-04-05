package PracticeLB.ARRAY;

public class BestTimeToBuyAndSellStocks2 {

    // Method
    public static int maxProfit(int[] arr) {
        int profit = 0;

        for (int i=1; i<arr.length; i++) {
            // if current elements is greater than previous elements, then subtract current Element - previous Element
            // & then add on profit
            if (arr[i] > arr[i-1]){
                profit = profit + (arr[i]-arr[i-1]);
            }
        }
        return profit;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 1, 4, 7, 3, 6 };
        System.out.println(maxProfit(arr));
    }
}

// Que - Maximum profit by buying and selling a share at most twice
// Algorithm
// if current elements is greater than previous elements, then subtract current Element - previous Element
// & then add on profit

// Time - O(n)
// Space - O(1)