package Recursion;

public class PrintPairsMethod {

    // Method
    static void printPairsMethod(int [] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        int [] printPairs = {1,3,4,5};
        printPairsMethod(printPairs);
    }
}
