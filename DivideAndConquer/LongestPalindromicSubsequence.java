package DivideAndConquer;

public class LongestPalindromicSubsequence {
    private int findLPSLength(String s1, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        if (startIndex == endIndex) {
            return 1;
        }

        int count1 = 0;
        if (s1.charAt(startIndex) == s1.charAt(endIndex)) {
            // increasing 1 in startIndex and -1 in endIndex
            count1 = 2 + findLPSLength(s1, startIndex+1, endIndex-1);
        }
        // increasing 1 in startIndex
        int count2 = findLPSLength(s1, startIndex+1, endIndex);
        // decreasing 1 in endIndex
        int count3 = findLPSLength(s1, startIndex, endIndex-1);

        return Math.max(count1, Math.max(count2, count3));
    }

    public int longestPS(String s1) {
        return findLPSLength(s1,0,s1.length() - 1);
    }

    // Main Class
    public static void main(String[] args) {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        System.out.println(lps.longestPS("hello"));
    }
}
