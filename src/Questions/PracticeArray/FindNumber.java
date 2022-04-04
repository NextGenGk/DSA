package Questions.PracticeArray;

public class FindNumber {
    // Method
    public void linearSearch(int[] intArray, int value){
        for (int i=0; i<intArray.length; i++){
            if (intArray[i] == value){
                System.out.println("Value is Found at the index of : " + i);
                return;
            }
        }
        System.out.println("Value not found in this array");
    }

    // Main Method
    public static void main(String[] args) {
        FindNumber fn = new FindNumber();
        int[] intArray = {1,5,8,3,9};
        fn.linearSearch(intArray,5);
    }
}
