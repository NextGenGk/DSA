package PracticeRecursion;

public class ProductOfArray {

    // Product of Array Method
    // Multiply
    public static int productOfArray(int[] arr, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * arr[i];
        }
        return result;
    }

    // Main Class
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        System.out.println(productOfArray(array,n));
    }
}
