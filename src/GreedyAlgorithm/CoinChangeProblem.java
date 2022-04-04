package GreedyAlgorithm;

import java.util.Arrays;

public class CoinChangeProblem {

    // Coin Change Problem Method
    static void coinChangeProblem(int[] coins, int totalAmount) {
        Arrays.sort(coins);
        int index = coins.length - 1;
        while (true) {
            int coinValue = coins[index];
            index--;
            int maxAmount = (totalAmount / coinValue) * coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin Value "+ coinValue + " taken count : "+(totalAmount/coinValue));
                totalAmount = totalAmount - maxAmount;
            }
            if (totalAmount == 0) {
                break;
            }
        }
    }

    // Main Class
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,1000};
        int totalAmount = 160;
        System.out.println("Coin Available : "+Arrays.toString(coins));
        System.out.println("Target amount : " + totalAmount);
        CoinChangeProblem.coinChangeProblem(coins, totalAmount);
    }
}
