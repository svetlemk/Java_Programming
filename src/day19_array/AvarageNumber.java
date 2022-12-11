package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {

        System.out.println("How many number would you like to enter?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] array = new int[number]; // create an array object
        // with the numbers user entered

        int sum = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Please input your number:");
           array[i] = input.nextInt();
           sum += array[i];

        }

        double avarage = (double) sum / number;
        DecimalFormat df = new DecimalFormat("0.00"); // create object for decimer formater

        System.out.println("Numbers" + Arrays.toString(array));
        System.out.println("sum = " + sum);

        System.out.println("avarage = " + df.format(avarage));


    }
}
/*AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number



 */