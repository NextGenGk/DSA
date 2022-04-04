package DivideAndConquer;

public class LongestCommonSubsequence {
    private int findLCSLength(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) {
            return 0;
        }
        int c1 = 0;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            // increasing 1 in both index
            c1 = 1 + findLCSLength(s1, s2, i1+1, i2+1);
        }
        // increasing 1 in 1st index
        int c2 = findLCSLength(s1, s2, i1+1, i2);

        // increasing 1 in 2nd index
        int c3 = findLCSLength(s1, s2, i1, i2+1);

        return Math.max(c1, Math.max(c2, c3));
    }

    public int longCSS(String s1, String s2) {
        return findLCSLength(s1, s2,0, 0);
    }

    // Main Class
    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.longCSS("elephant","elephant"));
    }

}
