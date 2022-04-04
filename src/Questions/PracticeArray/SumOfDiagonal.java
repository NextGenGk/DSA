package Questions.PracticeArray;

public class SumOfDiagonal {

    // Method
    public static int sumDiagonal(int[][] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i][i];
        }
        return sum;
    }

    // Main Method
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9} };
        System.out.println(sumDiagonal(arr));
    }
}

// int[][] arr = { {1,2,3},
//                 {4,5,6},
//                 {7,8,9} };
// Ans = 15
// Sum of Diagonal = sum = sum + arr[i][i];