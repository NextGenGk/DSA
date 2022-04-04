package Recursion;

public class SumAndProduct {
    static void sop(int [] arr){
        int sum = 0;
        int product = 1;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        for(int i=0; i< arr.length; i++){
            product = product * arr[i];
        }
        System.out.println(sum);
        System.out.println(product);
    }
    public static void main(String[] args) {
       int[] sumAndProduct = {1,4,6};
       sop(sumAndProduct);
    }
}
