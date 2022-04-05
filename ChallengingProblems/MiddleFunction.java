package ChallengingProblems;

import java.util.Arrays;

public class MiddleFunction {
    public static int[] middle(int[] arr) {
        // TODO
        /*
        original_array : Array to be copied from
        from_index : Starting index of range to be copied
        to_end : Ending index of range to be copied
        */
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }

    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(middle(intArr)));
    }
}
