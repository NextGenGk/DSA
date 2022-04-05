import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Basic {

    public static boolean[] seive(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        boolean[] isPrime = seive(8);
        for (int i = 0; i <= 8; i++) {
            System.out.println(i + " " + isPrime[i]);
        }
    }
}



