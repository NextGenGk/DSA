package DSA_ONE.Mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {

    // Method
    private static boolean[] sieveOfEratosthenes(int n) {
        // Create boolean Array with n+1 size
        boolean[] isPrime = new boolean[n+1];
        // fill all the value to true
        Arrays.fill(isPrime,true);

        // Initialize
        isPrime[0] = false;
        isPrime[1] = false;

        // looping to root N
        for (int i=2; i<=n/2; i++) {
            for (int j=2*i; j<=n; j=j+i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    // Main Function
    public static void main(String[] args) {
        boolean[] isPrime= sieveOfEratosthenes(40);
        for (int i=0; i<=40; i++) {
            System.out.println(i + " " + isPrime[i]);
        }
    }
}

// Time Complexity: O(n*log(log(n)))
//Auxiliary Space: O(n)

/* Prime numbers are natural numbers that are divisible by only 1 and the number itself. */