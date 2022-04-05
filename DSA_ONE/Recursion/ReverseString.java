package DSA_ONE.Recursion;

public class ReverseString {

    // Reverse String Method
    // We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive,
    // and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.
    // Reverse A String we opposite the beginning and ending Index (1,0)
    public static String reverseString(String str) {
        // Base case
        if (str == null || (str.length() <=1)) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0); // Recursive Case
        }
    }

    // Main Class
    public static void main(String[] args) {
        String str = "Gaurav";
        System.out.println(reverseString(str));
    }
}

/*
Time Complexity: O(n^2) as substr() method has a time complexity of O(k) where k is the size of the returned string.
 So for every recursive call, we are reducing the size of the string by one, which leads to a series like
 (k-1)+(k-2)+…+1 = k*(k-1)/2 = O(k^2) = O(n^2)
 Space - (n)
 */