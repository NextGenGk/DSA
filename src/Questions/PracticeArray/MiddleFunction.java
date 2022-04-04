package Questions.PracticeArray;

import java.util.Arrays;

public class MiddleFunction {
    // Method
    public static int[] middleFunction(int[] arr) {
        return Arrays.copyOfRange(arr,1,arr.length-1);
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(middleFunction(arr)));
    }
}

// int[] arr = {1,2,3,4,5};
// [2, 3, 4]
// original_array : Array to be copied from
// from_index : Starting index of range to be copied
// to_end : Ending index of range to be copied
