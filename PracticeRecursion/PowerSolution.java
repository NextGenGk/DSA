package PracticeRecursion;

public class PowerSolution {

    // Power Method
    // 3 * 3 * 3 * 3 = 81 (3 ki power 4)
    public static int power(int base, int exponent) {
        // Base Case
        if (exponent == 0) {
            return 1;
        }

        // Recursive case
        return base * power(base,exponent - 1);
    }

    // Main Class
    public static void main(String[] args) {
        System.out.println(power(3,4));
    }
}
