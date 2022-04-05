package DSA_ONE.Recursion;

public class PrintReverseString {

    // Function
    public static void printReverse(String str, int index){

        // Base Case
        if (index == 0){
            System.out.println(str.charAt(index));
            return;
        }

        // Print
        System.out.print(str.charAt(index));

        // Recursive Case
        printReverse(str, index-1);
    }

    // Main Method
    public static void main(String[] args) {
        String str = "Hero";
        printReverse(str, str.length()-1);
    }
}

// Time - 0(n)
// n represents the length of string