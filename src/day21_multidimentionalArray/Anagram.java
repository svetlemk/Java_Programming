package day21_multidimentionalArray;

import java.util.Arrays;

public class Anagram {
    public static void  main(String[]args){

        String str1 = "heart";
        String str2 = "earth";

        //String[] a1 = str1.split("");  // first method to convert to
       // String[] a2 = str2.split(""); // String so that sort() mesthi can be used

        char[] a1 =str1.toCharArray();
        char[] a2 =str2.toCharArray();

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println("-------------------------------");

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        boolean isAnagram = Arrays.equals(a1,a2);

        System.out.println(isAnagram);





        // boolean anagram = str1.sort().equals(str2.sort());



/*
Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false


        listen  silent
 */
    }
}
