package Array;

import java.util.Arrays;

public class CreateAnArray {
    public static void main(String[] args) {
        // Declare
        int[] arr;
        // Instantiate
        arr = new int[4];
        // Initializing
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 1;
        arr[3] = 7;

        System.out.println(Arrays.toString(arr));

        // String
        // Declare + Instantiate
        String [] sd2 = new String[2];

        // Initializing
        sd2[0] = "a";
        sd2[1] = "b";

        System.out.println(Arrays.deepToString(sd2));
    }
}
