package Questions.PracticeArray;

import java.util.Scanner;

public class AverageTemperature {
    // Main Method
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("How many days' temperature");
       int numDays = sc.nextInt();

       // Array DS (Create temp Array)
       int temp[] = new int[numDays];

       // record temperature
        int sum = 0;
        for (int i=0; i<numDays; i++){
            System.out.print("Day " + (i+1) + "'s high temp: ");
            // temperature saves in temps[i]
            temp[i] = sc.nextInt();
            sum = sum + temp[i];
        }

        // average
        double avg = sum/numDays;

        // count days above average
        int above = 0;
        for (int i =0; i< temp.length; i++){
            if (temp[i] > avg){
                above++;
            }
        }

        System.out.println();
        System.out.println("Average temperature " + avg);
        System.out.println(above + " days above average ");
    }
}
