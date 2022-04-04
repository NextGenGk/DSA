package DivideAndConquer;

public class HouseRobber {

    // Method
    public int maxMoneyRecursive(int[] houseNetWorth, int currentIndex) {
        if (currentIndex >= houseNetWorth.length) {
            return 0;
        }

        // 1st case
        int stealCurrentHouse = houseNetWorth[currentIndex] + maxMoneyRecursive(houseNetWorth, currentIndex + 2);
        // 2nd case
        int skipCurrentHouse = maxMoneyRecursive(houseNetWorth, currentIndex + 1);

        return Math.max(stealCurrentHouse, skipCurrentHouse);
    }

    public int maxMoney(int[] houseNetWorth) {
        return maxMoneyRecursive(houseNetWorth, 0);
    }

    // Main Class
    public static void main(String[] args) {
            HouseRobber houseRobber = new HouseRobber();
            int[] houseNetWorth = {6, 7, 1, 30, 8, 2, 4};
            System.out.println(houseRobber.maxMoney(houseNetWorth));
    }
}

