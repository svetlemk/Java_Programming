package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("-----------------------------");

        String str1 = "Today is the day to learn Java";// get words one by one

        String[] words = str1.split(" "); // create array with words

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------------");
        String sentence = "I love JAVA";

        String[] arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr));
        
        String revereSentence ="";

        for (int i = 0; i < arr.length; i++) {

            revereSentence +=arr[i] +" ";

        }

        System.out.println(revereSentence);




    }
}
