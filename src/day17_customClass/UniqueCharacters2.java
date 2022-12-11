package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */

        String str = "aabccd";

        String unique = "";

        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j); // a as first char compared to every char i the string(FIRST FOCIS ON ONE CHAR
            int frequency = 0; /// LATER WE PUT LOOP OUTSIDE.

            for (int i = 0; i < str.length(); i++) { // how many times the (char ch) has appeared in the string
                if(str.charAt(i) == ch ){ // if the char has appeared in the string
                    frequency++;          // increase the frequency.
                }
            }
            if (frequency == 1){ // if freq == 1 , the char is unigue
                unique += ch;
            }

            System.out.println(unique);

        }








    }



}
