package DSA_ONE.Mathematics;

public class FindTrailingZeroes {

    // Method
   private static int findTrailingZeroes(int n) {
       // Initialize result
       int result = 0;

       // Negative Number
       if (n < 0) {
           return -1;
       }

       // Looping
       for (int i=5; i<=n; i=i*5) {
           result = result + n/i;
       }
       return result;
   }

   // Main Function
    public static void main(String[] args) {
        System.out.println(findTrailingZeroes(40));
    }
}

// Time Complexity: O(log5n)
//Auxiliary Space: O(1)