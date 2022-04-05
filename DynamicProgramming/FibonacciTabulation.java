package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class FibonacciTabulation {

    public static int fibTab(int n) {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(0);
        tab.add(1);
        for (int i=2; i<=n-1; i++) {
            int n1 = tab.get(i-1);
            int n2 = tab.get(i-2);
            tab.add(n1 + n2);
        }

        return tab.get(n-1);
    }

    // Main Class
    public static void main(String[] args) {
        HashMap<Integer, Integer> tab = new HashMap<>();
        System.out.println(fibTab(6));
    }
}
