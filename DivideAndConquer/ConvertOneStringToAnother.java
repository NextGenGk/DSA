package DivideAndConquer;

public class ConvertOneStringToAnother {

    private int findMinOperations (String s1, String s2, int i1, int i2) {
        //  delete all remaining character of s2
        if (i1 == s1.length()) {
            return s2.length() - i2;
        }
        // delete all remaining character of s1
        if (i2 == s2.length()) {
            return s1.length() - i1;
        }
        // both string have matching character, then we are going to recursively call for remaining length
        if (s1.charAt(i1)==s2.charAt(i2)) {
            return findMinOperations(s1, s2, i1+1, i2+1);
        }
        // increasing 1 in first index
        int deleteOp = 1 + findMinOperations(s1, s2, i1+1, i2);
        // increasing 1 in second index
        int insertOp = 1 + findMinOperations(s1, s2, i1, i2+1);
        // increasing 1 in both index
        int replaceOp = 1 + findMinOperations(s1, s2, i1+1, i2+1);


        return Math.min(deleteOp, Math.min(insertOp, replaceOp));
    }

    // Global Method
    public int findMinOperations(String s1, String s2) {
        return findMinOperations(s1, s2, 0, 0);
    }

    // Main Class
    public static void main(String[] args) {
        ConvertOneStringToAnother convertOneStringToAnother = new ConvertOneStringToAnother();
        System.out.println(convertOneStringToAnother.findMinOperations("table","tbres"));
        System.out.println(convertOneStringToAnother.findMinOperations("catch","carch"));
    }
}
