package DynamicProgramming;

public class HouseRobber {

    // Top-Down Approach ( Memoization )
    public static int maxMoneyTopDown(int[] dp, int[] HouseNetWorth, int currentIndex) {
        if (currentIndex >= HouseNetWorth.length) {
            return 0;
        }

        if (dp[currentIndex] == 0) {
            int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyTopDown(dp, HouseNetWorth, currentIndex+2);
            int skipCurrentHouse = maxMoneyTopDown(dp, HouseNetWorth, currentIndex+1);

            dp[currentIndex] = Math.max(stealCurrentHouse, skipCurrentHouse);
        }

        return dp[currentIndex];
    }

        public int maxMoney(int[] HouseNetWorth) {
        int dp[] = new int[HouseNetWorth.length];
        return maxMoneyTopDown(dp, HouseNetWorth,0);
    }

    // // Bottom Up Approach ( Tabulation )
    public int maxMoneyBottomUp(int[] wealth) {
        int dp[] = new int[wealth.length + 2]; // '+1' to handle the zero house
        dp[wealth.length] = 0; // if there are no houses, the thief can't steal anything
        for (int i = wealth.length - 1; i >= 0; i--) {
            dp[i] = Math.max(wealth[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }

    public static void main(String[] args) {
        HouseRobber hR = new HouseRobber();
        int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};

        // Top-Down Approach ( Memoization )
        System.out.println(hR.maxMoney(HouseNetWorth));

        // Bottom Up Approach ( Tabulation )
        System.out.println(hR.maxMoneyBottomUp(HouseNetWorth));
    }
}
