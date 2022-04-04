package Questions.PracticeArray;

import java.util.Arrays;

public class TwoSum {
    // Method
    public int[] twoSum(int[] nums, int target){
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    // Main Method
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] intArray = {2,7,11,15};
        int[] result = ts.twoSum(intArray,9);
        System.out.println(Arrays.toString(result));
    }
}

// pair is {2,7)
