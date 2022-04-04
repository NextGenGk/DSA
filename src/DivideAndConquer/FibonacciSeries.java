package DivideAndConquer;

public class FibonacciSeries {

    // Fibonacci Series Method
    static int fibonacciSeries(int n){
        if (n<0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }

    // Main Class
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(9));
    }
}
