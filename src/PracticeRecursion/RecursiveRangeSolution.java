package PracticeRecursion;

public class RecursiveRangeSolution {

    // Recursive range Method
    // Sum of Numbers (5 + 4 + 3 + 2 + 1)
    public static int recursiveRange(int n) {
        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Case
        return n + recursiveRange(n - 1);
    }

    // Main Class
    public static void main(String[] args) {
        System.out.println(recursiveRange(5));
    }
}
