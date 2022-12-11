package day19_array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] ascending = new char[26]; //index 0-25
        char[] descending = new char[26];


        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {// access every index in teh array
            ascending[i] = (char) j; // assign a-z
            descending[i] = (char) k;// assign z-a

        }


        System.out.println(Arrays.toString(descending));
        System.out.println(Arrays.toString(ascending));

        System.out.println("---------------------------------");

        char[] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }

        System.out.println(Arrays.toString(characters));



    }
}
/*	3. Create a char array and store all the alphabet letters in ascending order


 */