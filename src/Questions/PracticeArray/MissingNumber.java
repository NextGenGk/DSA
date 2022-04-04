package Questions.PracticeArray;

public class MissingNumber {
    // Method
    public void missingNumber(int[] arr){
        int sumOfArray = 0;
        int noOfElements = 0;

        // Sum of all Array
        for (int i : arr){
            sumOfArray = sumOfArray + i;
        }

        // Number of Elements
        noOfElements = 10*(10+1)/2;  // sum of n number = n*(n+1)/2
        int difference = noOfElements - sumOfArray;
        System.out.println("Missing Number is : " + difference);
        }

    // Main Method
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MissingNumber ms = new MissingNumber();
        ms.missingNumber(intArray);

    }
}
