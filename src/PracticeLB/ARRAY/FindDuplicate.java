package PracticeLB.ARRAY;

public class FindDuplicate {

    // Function
    public static int findDuplicate(int[] nums) {

        // first we visit all indexes
        for (int i = 0; i < nums.length; i++) {
            // checking Number (if starting is negative then (abs) convert in positive Number)
            int index = Math.abs(nums[i]); //-3

            // if checking number is negative, then we know that next time is visit in this index
            if (nums[index]<0) {
                return index;
            }
            // if the number is not negative, then convert it to negative
            nums[index] = -nums[index];
        }
        return -1;
    }

    // Main Function
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int result = findDuplicate(nums);
        System.out.println(result);
    }
}

// Time - O(n)
// Space - O(1)

// first we visit all indexes
// then, checking Number (if starting is negative then abs convert in positive Number)
// if checking number is negative, then we know that next time is visit in this index
// if the number is not negative, then convert it to negative