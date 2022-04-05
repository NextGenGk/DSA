package Array2D;

import java.util.Arrays;

public class CreateAn2DArray {
    public static void main(String[] args) {
        // Declare
        int[][] int2DArray;
        // Instantiate
        int2DArray = new int[2][2];
        // Initializing
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        // String
        // Declare + Instantiate
        String [][] sd2 = new String[2][2];

        // Initializing
        sd2[0][0] = "a";
        sd2[0][1] = "b";
        sd2[1][0] = "c";
        sd2[1][1] = "d";

        System.out.println(Arrays.deepToString(sd2));
    }
}
