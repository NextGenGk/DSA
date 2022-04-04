package Questions.PracticeArray;

import java.util.Arrays;

public class RotateMatrix {
    public static boolean rotateMatrix(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;
        int n = matrix.length;

        // looping through layer
        for (int layer =0; layer<n/2; layer++){
            int first = layer;
            int last = n-1-layer;

            // looping through cells
            // column
            for (int i=first; i<last; i++){
                int offset = i - first;

                // index of 1st row(layer) and 1st column(loop index)
                // saving top cell
                int top = matrix[first][i];
                // left cell is located at last row and first column
                matrix[first][i] = matrix[last-offset][first];
                // last column and last row
                matrix[last-offset][first] = matrix[last][last-offset];
                // first row and last column
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] [] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(matrix);
        System.out.print(Arrays.deepToString(matrix));

    }
}
